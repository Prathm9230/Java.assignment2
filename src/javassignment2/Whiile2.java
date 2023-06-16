package javassignment2;
//Q2.Write a Program to reverse the integer number //
import java.util.Scanner;
public class Whiile2 {
    public static void main(String[] args) {
        int num,r,Ans=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        num =sc.nextInt();
        while(num>0)
        {
            r = num % 10;
            Ans = Ans * 10 + r;
            num = num/10;
        }
        System.out.println("Reverse of the given number is:" + Ans);
    }
}
