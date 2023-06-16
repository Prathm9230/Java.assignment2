package javassignment2;
import java.util.Scanner;
//Q2. Read a Number 1,10,100,1000 and display unit,ten,hundred,thousand//

public class Ifelse2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        if(num == 1)
        {
            System.out.println("Unit:" + num);
        }
        else if(num == 10)
        {
            System.out.println("Ten:" + num);
        }
        else if(num == 100)
        {
            System.out.println("Hundread:" + num);
        }
        else if(num == 1000)
        {
            System.out.println("Thousand:" + num);
        }
        else
        {
            System.out.println("Invalid" + num);
        }

    }
}
