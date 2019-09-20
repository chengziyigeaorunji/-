package edu.xalead;

import java.math.BigInteger;

public class Test12 {
    public static int Add(int num1,int num2){
        BigInteger a=new BigInteger(String.valueOf(num1));
        BigInteger b=new BigInteger(String.valueOf(num2));
        int c=(int)a.add(b).intValue();
        return c;
    }
    public static void main(String[] args) {
        int num1=111;
        int num2=899;
        System.out.println(Add(num1,num2));
    }
}
