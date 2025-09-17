import java.util.Scanner;

public class NumberToWords{

    public static String numberToWords(int n){
        String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String result = "";
        while(n>0){
            int digit = n%10;
            result = words[digit] + " " + result;
            n = n/10;
        }
        return result;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=0;
        System.out.print("Enter the number you want to convert to words : ");
        n = sc.nextInt();
        String words = numberToWords(n);
        System.out.println("The number in words is : " + words);
    }
    
}