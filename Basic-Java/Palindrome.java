import java.util.Scanner;

public class Palindrome{

    public static boolean isPalindrome(int n){
        int original =n;
        int reverse = 0;
        while(n>0){
            int digit = n%10;
            reverse = reverse*10 + digit;
            n = n/10;
        }
        if(original == reverse){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to check : ");
        int n = sc.nextInt();
        boolean isPalindrome = isPalindrome(n);
        if(isPalindrome){
            System.out.println("The number is a palindrome");
        }
        else{
            System.out.println("The number is not a palindrome");
        }
    }
}