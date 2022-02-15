package com.example.demo;

public class Puppy {       //创建一个类
    int puppyAge;
    public Puppy(String name){    //创建构造器，参数为name
        System.out.println("名字叫："+ name);
    }

//    public static void main(String[] args) {
//        Puppy myPuppy=new Puppy("tomo");
//    }

    public void setAge( int age ){     //添加一个方法setAge
        puppyAge = age;
    }

    public int getAge( ){              //添加一个方法getAge
        System.out.println("年龄为 : " + puppyAge );
        return puppyAge;
    }

    public static void main(String[] args) {       //main实例化类
        Puppy myPuppy = new Puppy("tomo");       //创建对象
        myPuppy.setAge(2);                           //调用方法，获取puppyAge
        myPuppy.getAge();                            //调用方法，return    puppyage
        System.out.println("变量的值为："+myPuppy.puppyAge);        //打印变量的值


    }



}

