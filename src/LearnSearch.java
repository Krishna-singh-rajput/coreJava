public class LearnSearch {
    public static void Main(String[] args){
        int array[]={10,20,30,40,50};
        int key=30;
        int arrayLength=array.length;
        System.out.println("The size of array is: "+arrayLength);
        for (int i=0;i<arrayLength;i++)
        {
            if(key==array[i])


            {
                System.out.println("The found at the position: "+i);
            }
        }
        System.out.println("Key is not found");

            }
        }
