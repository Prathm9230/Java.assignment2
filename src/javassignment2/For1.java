package javassignment2;
//Q1.Write a Program for the sum of n natural numbers.//
import java.util.Scanner;

public class For1 {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int N = sc.nextInt();
        for(int i=1;i<=N;i++)
        {
            sum+=i;
        }
        System.out.println("The sum of"+ " "+N+"natural number is:"+sum);
    }
}
