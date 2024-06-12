package com.krishna.dsa.arrays.productoftwohighestnumber;

public class MainProductOfTwoHighestNumberInArray {
    public static void main(String[] args) {
        int[] intArray = {10,20,30,40,50};
        ProductOfTwoHighestNumberInArray productOfTwoHighestNumberInArray=new ProductOfTwoHighestNumberInArray();
       int result= productOfTwoHighestNumberInArray.productOfTwoNumbers(intArray);
        System.out.println("The product of 2 numbers is: "+result);
    }
}
