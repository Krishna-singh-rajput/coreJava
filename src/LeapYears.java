public class LeapYears {
    public static void Main(String[] args){
        int year = 2024;
        System.out.println("Enter an year ::");
        if (year % 4 == 0 && year %100!=0 || year%400 ==0){
System.out.println("LeapYear");

        }
        else{
            System.out.println("not a leap year");

        }
    }


}
