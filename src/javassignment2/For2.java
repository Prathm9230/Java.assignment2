package javassignment2;
//Q2.Write a Program to reverse the integer number.//
import java.util.Scanner;

public class For2 {
    public static void main(String[] args) {
        int num,r,Ans=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        num =sc.nextInt();
        for(int i=1;num>0;i++)
        {
            r = num % 10;
            Ans = Ans * 10 + r;
            num = num/10;
        }
        System.out.println("Reverse of the given number is:" + Ans);

    }
}
