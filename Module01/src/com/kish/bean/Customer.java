package com.kish.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Customer {

    private String name;
    private Integer age;

    public Customer() {
    }

    public Customer(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args){
        System.out.println("helloworld1231111!!!");

        List<String> list=new ArrayList<>();

        list.add("aa");
        list.add("bb");

        for (String s: list) {
            System.out.println(s);
        }

        Date date = new Date();

    }

    public void sayHello(){
        /*try {
            FileInputStream fileInputStream=new FileInputStream("a.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }*/
        System.out.println("sayHello...");
    }
}
