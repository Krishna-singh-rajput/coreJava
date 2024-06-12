import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String [] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the number;");
        int number = scanner.nextInt();
        scanner.close();
        System.out.println("MultiplicationTable of" + number + ":");
        for (int i = 1; i <= 10; i++)
            System.out.println(number + "2" + i + "=" + (number * i));
    }

    }

