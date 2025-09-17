import java.util.Scanner;

public class FibonacciSeries{
    public static void fibonacciSeries(int n){
        int a = 0;
        int b = 1;
        System.out.print(a + " " + b);
        for(int i = 2; i<n; i++){
            int c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms you want to print : ");
        int n = sc.nextInt();
        fibonacciSeries(n);
    }
}