public class MissingNumber {
        public static int findMissingNumberInArray(int[] arr, int n) {
            int sumOfFirstN = (n * (n + 1)) / 2;
            int sumOfArray = 0;
            for (int num : arr) {
                sumOfArray += num;
            }
            return sumOfFirstN - sumOfArray;
        }
        public static void main(String[] args) {
            int[] myArray = {1, 2, 3, 4, 6};
            int n = 6;
            MiddelArray middelArray=new MiddelArray();
            System.out.println(findMissingNumberInArray(myArray, n));
        }
    }
