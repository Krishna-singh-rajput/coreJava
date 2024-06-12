public class MiddelArray {

        public  void middle(int[] arr) {
            for (int i = 1; i < arr.length - 1; i++) {
                System.out.print(arr[i]+" ");
            }
        }

    public static void main(String[] args) {
        int myarr[]={1,2,3,4,5,6};
        MiddelArray middelArray=new MiddelArray();
        middelArray.middle(myarr);
    }

}


