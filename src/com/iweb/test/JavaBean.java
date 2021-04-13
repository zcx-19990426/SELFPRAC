package com.iweb.test;

public class JavaBean implements java.io.Serializable{
    private String name=null;
    private int age=0;
    private String adress=null;

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

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public JavaBean() {
    }
}
