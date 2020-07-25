package com.example.sharif.blood_donaters;

/**
 * Created by SHARIF on 8/14/2018.
 */

 public class Donete {
     String name,phone,cnic,b_group;
    public Donete(String a,String b,String c,String d){
        this.name=a;
        this.phone=b;
        this.cnic=c;
        this.b_group=d;
    }

    public String getName(){
        return name;
    }
    public String getPhone(){
        return phone;
    }
    public String getCnic(){
        return  cnic;
    }
    public  String getB_group(){
        return b_group;
    }
}
