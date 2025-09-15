import java.util.Scanner;

public class Prime{
    public static boolean checkPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i =2; i<=Math.sqrt(n); i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to check : ");
        int n = sc.nextInt();
        boolean isPrime = checkPrime(n);
        if(isPrime){
            System.out.println("The number is a prime number");
        }
        else{
            System.out.println("The number is not a prime number");
        }
    }
}