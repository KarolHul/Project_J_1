package org.example;

public class Dog {
    String Breed,color;
    int age;

    public Dog(String b,String c,int a){
        Breed = b;
        color = c;
        age = a;
    }
    public void bark(){
        System.out.println("Bark");
    }

    public void sleep(){
        System.out.println("ZZZ");
    }
}
