import java.util.Scanner;


public class loops{

    public static int sum(int n){
    int sum = 0;
    for(int i =1; i<=n; i++){
        sum = sum + i;
    }
    return sum;
}


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the maximum number you want");
        int n = sc.nextInt();
        int sum = sum(n);
        System.out.print("The sum of the numbers is: ");
        System.out.print(sum);
        
    }
}