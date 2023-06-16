import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x:");
        int x = sc.nextInt();
        System.out.println("Enter the value of y:");
        int y = sc.nextInt();
        double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        System.out.println("Euclidean distance from point("+" "+x+","+y+")to origin (0,0) is:"+distance );
    }
}
