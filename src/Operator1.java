import java.util.Scanner;
public class Operator1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        System.out.println("Enter the second number:");
        int b = sc.nextInt();
        System.out.println("Enter the third number:");
        int c = sc.nextInt();

        int OP1 = a+b*c;
        System.out.println("The result of OP1 is:" + OP1);
        int OP2 = c+a/b;
        System.out.println("The result of OP2 is:" + OP2);
        int OP3 = a%b+c;
        System.out.println("The result of OP3 is:" + OP3);
        int OP4 = a*b+c;
        System.out.println("The result of OP4 is:" + OP4);

        int Max = Math.max(Math.max(OP1,OP2),Math.max(OP3,OP4));
        int Min = Math.min(Math.min(OP1,OP2),Math.min(OP3,OP4));
        System.out.println("The maximum between three results is:" + Max);
        System.out.println("The minimum between three results is:" + Min);
    }
}
