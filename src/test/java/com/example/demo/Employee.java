package com.example.demo;

public class Employee {
    String name;
    int age;
    String designation;
    double salary;

    public Employee(String name){
        this.name= name;
    }
    public void emaAge(int emaAge){
        age=emaAge;
    }
    /* 设置designation的值*/
    public void empDesignation(String empDesig){
        designation = empDesig;
    }
    /* 设置salary的值*/
    public void empSalary(double empSalary){
        salary = empSalary;
    }

    public void print(){
        System.out.println("名字name为："+name);
        System.out.println("年龄age为："+age);
        System.out.println("职位designation为："+designation);
        System.out.println("薪水empSalary为："+salary);
    }
}
