package com.krishna.dsa.arrays.numberinarray;

public class MainNumberInArray {
    public static void main(String[] args) {
    int myArray[]={1,2,3,4,5,6};
    int number=8;
    NumberInArray numberInArray=new NumberInArray();
    boolean result=numberInArray.checkNumberInArray(myArray,number);
        System.out.println(result);
    }
}
