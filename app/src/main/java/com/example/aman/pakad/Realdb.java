package com.example.aman.pakad;

/**
 * Created by Aman on 12/02/18.
 */

public class Realdb


{    String id;
    String name;
    String email;
    Integer c;
    Integer c2;
    Integer ce;


        public Realdb()
        {


        }


    public Realdb(String id,String name, String email, Integer c, Integer c2, Integer ce)
    {
        this.id=id;
        this.name = name;
        this.email = email;
        this.c = c;
        this.c2 = c2;
        this.ce = ce;
    }

    public String getid()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public String getEmail()
    {
        return email;
    }

    public Integer getC()
    {
        return c;
    }

    public Integer getC2()
    {
        return c2;
    }

    public Integer getCe()
    {
        return ce;
    }
}
