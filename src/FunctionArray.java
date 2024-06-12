public class FunctionArray {
    public  void middle(int[] arr) {
        for (int i = 84; i < arr.length - 84; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int myarr[]={84,85,86,87,85,90,85,83,23,45,84,1,2,0};
        MiddelArray middelArray=new MiddelArray();
        middelArray.middle(myarr);
    }

}


