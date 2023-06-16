package javassignment2;
import java.util.Scanner;
//Q1. Read a single Digit Number and write in word//
public class Ifelse1{
    public static void main(String[] args)
    {        String word=" ";
             Scanner sc = new Scanner(System.in);
             System.out.println("Enter the Single digit number:");
             int num = sc.nextInt();
             if(num<10)
             {
                 if(num == 0)
                 {
                     word = "Zero";
                 }
                 else if(num == 1)
                 {
                     word = "one";
                 }
                 else if(num == 2)
                 {
                     word = "Two";
                 }
                 else if(num == 3)
                 {
                     word = "Three";
                 }
                 else if(num == 4)
                 {
                     word = "Four";
                 }
                 else if(num == 5)
                 {
                     word = "Five";
                 }
                 else if(num == 6)
                 {
                     word = "Six";
                 }
                 else if(num == 7)
                 {
                     word = "Seven";
                 }
                 else if(num == 8)
                 {
                     word = "Eight";
                 }
                 else if(num == 9)
                 {
                     word = "Nine";
                 }
                 else{
                     System.out.println("Enter the valid number.");
                     System.exit(0);
                 }
             }
             else {
                 System.out.println("Sorry,enter the number less than 10.");
                 System.exit(0);
             }
            System.out.println("The given number is:"+ word);
        }
}
