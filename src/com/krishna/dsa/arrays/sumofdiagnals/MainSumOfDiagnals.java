package com.krishna.dsa.arrays.sumofdiagnals;

public class MainSumOfDiagnals {
    public static void main(String[] args) {
       int[][] MyArray2D= {{1,2,3},{4,5,6},{7,8,9}};
       SumOfDiagnals sumOfDiagnals=new SumOfDiagnals();
       int resultSum=sumOfDiagnals.calculateSumOfDaignals(myArray2D);
        System.out.println("The sum of diagnals is: "+resultSum);
    }
}
