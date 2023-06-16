package javassignment2;
//Q3.Write a Program to find Palindrome Number//
import java.util.Scanner;

public class For3 {
    public static void main(String[] args) {
        int num,r,Ans=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        num =sc.nextInt();
        int temp = num;
        for(int i=1;num>0;i++)
        {
            r = num % 10;
            Ans = Ans * 10 + r;
            num = num/10;
        }
        System.out.println("Reverse of the given number is:" + Ans);
        if(Ans == temp)
        {
            System.out.println("Number is palindrome number.");
        }
        else
        {
            System.out.println("Number is not palindrome number.");
        }
    }
}
