import java.util.Scanner;

public class Armstrong{
    public static boolean armstrong(int n){
        int original = n;
        int sum = 0;
        while(n>0){
            int digit = n%10;
            sum = sum + (digit*digit*digit);
            n = n/10;
        }
        if(sum == original){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to check : ");
        int n = sc.nextInt();
        boolean isArmstrong = armstrong(n);
        if(isArmstrong){
            System.out.println("The number is an Armstrong number");
        }
        else{
            System.out.println("The number is not an Armstrong number");
        }
    }
}