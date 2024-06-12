package com.krishna.dsa.arrays;

public class MainRotateMatrix {
    public class SumOfDiagnals {

        public int calculateSumOfDaignals(int [][]arry)
        {
            int sum=0;
            for(int i=0;i< arry.length;i++)
            {
                sum=sum+arry[i][i];
            }
            return sum;
        }
    }
}
