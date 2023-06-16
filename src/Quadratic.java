import java.util.Scanner;
public class Quadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a = sc.nextInt();
        System.out.println("Enter the value of b:");
        int b = sc.nextInt();
        System.out.println("Enter the value of c:");
        int c = sc.nextInt();
        int delta= (b*b-4*a*c);
        double  Root_1 = (-b + Math.sqrt(delta))/(2*a);
        double  Root_2 = (-b - Math.sqrt(delta))/(2*a);
        System.out.println("The result of Root_1 is:"+ Root_1);
        System.out.println("The result of Root_2 is:"+ Root_2);
        System.out.println("The value of delta is:"+ delta);


    }
}
