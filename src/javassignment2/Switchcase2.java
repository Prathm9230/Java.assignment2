package javassignment2;
//Q2.Write a Program to print the month name for the given number.//

import java.util.Scanner;

public class Switchcase2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int month =sc.nextInt();
        switch(month)
        {
            case 1:
                System.out.println("This is January month.");
                break;
            case 2:
                System.out.println("This is February month.");
                break;
            case 3:
                System.out.println("This is March month.");
                break;
            case 4:
                System.out.println("This is April month.");
                break;
            case 5:
                System.out.println("This is May month.");
                break;
            case 6:
                System.out.println("This is June month.");
                break;
            case 7:
                System.out.println("This is July month.");
                break;
            case 8:
                System.out.println("This is August month.");
                break;
            case 9:
                System.out.println("This is September month.");
                break;
            case 10:
                System.out.println("This is October month.");
                break;
            case 11:
                System.out.println("This is November month.");
                break;
            case 12:
                System.out.println("This is December month.");
                break;
            default:
                System.out.println("This is not valid month.");
        }
    }
}
