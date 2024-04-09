package com.driver.test;
class A{
    public String meth(){
        return "Invoking method from class A";
    }
}
class B extends A {
    public String meth(){
        return "Method is overridden in Extendend class B";
    }
}
public class TestCases {
    public static void main(String[] args){
        B b = new B();
        System.out.println(b.meth()) ;
    }
}
