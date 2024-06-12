package com.krishna.dsa.arrays.numberinarray;

public class NumberInArray {

    public boolean checkNumberInArray(int arr[],int number)
    {
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]==number)
            {
               return true;
            }
        }
        return false;
    }
}
