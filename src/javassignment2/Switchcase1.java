package javassignment2;
//Q1.Write a Program to Check Vowel or Consonant//
import java.util.Scanner;

public class Switchcase1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the letter:");
        char letter =sc.nextLine().charAt(0);
        switch(letter)
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("The vowel letter is:"+ letter);
                break;
            default:
                System.out.println("The consonant letter is:"+ letter);
        }
    }
}
