package com.example.asus.student;

public class Student {
    public static void set_id(int id) {
    }

    public static void setname(String name) {
    }

    public String getName() {
        return this.name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getPhone() {
        return this.phone;
    }

    public  void setPhone(Long phone) {
        this.phone = phone;
    }

    private   String name;
    private  String id;
    private   Long phone;



}
