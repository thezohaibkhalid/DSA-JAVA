import java.util.Scanner;

public class FrequencyofDigit{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to check : ");
        int n = sc.nextInt();
        int[] frequency = new int[10];
        int original = n;
        while(n>0){
            int digit = n%10;
            frequency[digit]++;
            n = n/10;
    }
    for(int i = 0; i<10; i++){
        System.out.println("The frequency of " + i + " is " + frequency[i]);
    }
    System.out.println("The original number is " + original);
}
}