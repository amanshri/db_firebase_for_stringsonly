package com.example.aman.pakad;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class front extends AppCompatActivity
{

    EditText edittextname;
    EditText edittextemail;
    EditText edittextcontact;
    EditText edittextcontact2;
    EditText edittextcontacte;
    Button buttonsubmit;

DatabaseReference realdb;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front);

            realdb= FirebaseDatabase.getInstance().getReference("name");

        edittextname=(EditText)findViewById(R.id.editTextname);
        edittextemail=(EditText)findViewById(R.id.editTextemail);
        edittextcontact=(EditText)findViewById(R.id.editTextcontact);
        edittextcontact2=(EditText)findViewById(R.id.editTextcontact2);
        edittextcontacte=(EditText)findViewById(R.id.editTextcontacte);
        buttonsubmit=(Button)findViewById(R.id.buttonsubmit);


        buttonsubmit.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
               adddb();

            }
        });

    }




        public void adddb()
        {
            String name=edittextname.getText().toString().trim();
            int c = Integer.parseInt(edittextcontact.toString());
            int c2 = Integer.parseInt(edittextcontact2.toString());
            int ce = Integer.parseInt(edittextcontacte.toString());
            String email= edittextcontact.getText().toString().trim();

            if(!TextUtils.isEmpty(name) )

            {
               String id=realdb.push().getKey();
                Realdb data =new Realdb(id,name, email,c,c2,ce);
                realdb.child(id).setValue(data);
            }
            else
            {
                Toast.makeText(this, "at least 2 contact toh upload kar de", Toast.LENGTH_SHORT).show();
            }


        }

}