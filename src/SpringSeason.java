import java.sql.SQLOutput;
import java.util.Scanner;
public class SpringSeason {
    public static void main(String[] args) {
        boolean is_SpringSeason;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month:");
        int m = sc.nextInt();
        System.out.println("Enter the date:");
        int d = sc.nextInt();
        if ((m==3 && d>=20 && d<=31) || (m==4 && d>=1 && d<=30) ||  (m==5 && d>=1 && d<=31) || (m==6 && d>=1 && d<=20))
        {
            is_SpringSeason=true;
            System.out.println("is it SpringSeason?"+is_SpringSeason );
        }
        else
        {
            is_SpringSeason =false;
            System.out.println("is it SpringSeason?"+ is_SpringSeason);
        }

    }
}
