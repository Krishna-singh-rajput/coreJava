 public class RemoveDuplicates {
        public  void removeDuplicates(int[] arr) {
           int [] temp;
            int j=0;
            for (int i = 0; i < arr.length-1; i++) {
                if (arr[i] != arr[i + 1]) {
                    arr[j] = arr[i];
                    j++;
                }
            }
            arr[j]=arr[arr.length-1];
            for (int i=0;i<j;i++)
            {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            }
 }
