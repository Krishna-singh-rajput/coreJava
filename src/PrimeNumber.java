public class PrimeNumber {
    public static void main (String[] args){
        int num = 19;
        for(int i = 2; i<= num/2;++i){
            if(num% i == 0) {
                System.out.println(num + " is a prime number.");
            }
                else
                {
                    System.out.println(num + "is not a prime number.");
                }
            }
        }
    }

