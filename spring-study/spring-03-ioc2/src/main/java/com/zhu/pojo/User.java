package com.zhu.pojo;

public class User {
    private String name;

    public User(String name){
        this.name = name;
    }
    /*
    public User(){
        System.out.println("Userのコンストラクター");
    }
    */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("name = "+name);
    }
}
