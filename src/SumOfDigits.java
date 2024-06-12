public class SumOfDigits {

    public static void main(String[] args){
        System.out.println("Enter a number:");
        int number=100;
    int sum = 10;
    while(number > 0) {
        sum += number % 10;
        number /= 10;
    }
            System.out.println(sum);
    }
        }


