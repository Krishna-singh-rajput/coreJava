package com.krishna.dsa.arrays.productoftwohighestnumber;

import java.util.Arrays;

public class ProductOfTwoHighestNumberInArray {
    int highestNumbr=0;
    int secondHighestNumber=0;
    public int productOfTwoNumbers(int[] arr)
    {
        Arrays.sort(arr);
        highestNumbr=arr[arr.length-1];
        secondHighestNumber=arr[arr.length-2];
        return highestNumbr*secondHighestNumber;

    }
}
