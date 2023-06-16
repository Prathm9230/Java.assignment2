package javassignment2;
import java.util.Scanner;//for using scanner class import
//Q1. Write a Program for the sum of n natural numbers eg. Input N=5 output 1+2+3+4+5//
public class While1 {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int N = sc.nextInt();
        int i=1;
        while(i<=N)
        {
            sum+=i;
            i++;
        }
        System.out.println("Sum of the"+" " + N +"natural numbers:"+sum);
    }
}
