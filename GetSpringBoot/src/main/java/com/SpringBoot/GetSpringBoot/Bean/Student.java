package com.SpringBoot.GetSpringBoot.Bean;


//StudentBean

public class Student {
    private int id;
    private String name;
    private int age;
    private int phonenumber;
    private String email;


    public Student(int id, String name, int age, int phonenumber, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phonenumber = phonenumber;
        this.email = email;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPrint(){
        return id+" "+name+" "+age+" "+phonenumber +" "+email;
    }


}
