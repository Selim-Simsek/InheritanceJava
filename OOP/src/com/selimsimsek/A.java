package com.selimsimsek;

public class A {

    int result;
    public void sum(int a,int b)
    {        result = a + b;
        System.out.println("Sum="+result);

    }
}

class B extends A{
    public void multiply(int a,int b){
        result = a * b;
        System.out.println("Multiply="+result);

    }

    public static void main(String[] arg){
        B exMethod = new B();
        exMethod.sum(10,7);
        exMethod.multiply(5,5);
    }
}
