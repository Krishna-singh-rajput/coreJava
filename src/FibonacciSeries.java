public class FibonacciSeries {
    class Main{
        
        public static void main(String[] args){
            int n = 10;
           int firstTerm= 0;
          int SecondTerm = 1;
            System.out.println("FibonacciSeries 10 terms;");
            for(int i = 1; i<=n; ++i){
                System.out.print(firstTerm + ",");
                int nextTerm = firstTerm + SecondTerm;
                firstTerm = nextTerm;
            }
        }
    }
}
