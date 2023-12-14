import java.util.Random;
import java.util.Scanner;

public class RockPaperscissors {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Random rr = new Random();
        int comI = rr.nextInt(3);

        System.out.println("Rock Paper Cizzer Game");
        System.out.println("Computer Vs You");
        System.out.println(" paper = 0 , cizzer = 1 , rock = 2");
        System.out.print("Enter your choice : ");
        int UserI = sc.nextInt();

        if (comI == UserI) {
            System.out.println("Draw No one win");
        } else if (comI == 0 && UserI == 1 || comI == 1 && UserI == 2 || comI == 2 && UserI == 0) {
            System.out.println("You win Congration");
        } else if (comI == 1 && UserI == 0 || comI == 2 && UserI == 1 || comI == 0 && UserI == 2) {
            System.out.println("Computer Win");
        } else {
            System.out.println("Enter Valid choice");
        }

        if (comI == 0) {
            System.out.println("Computer choice was Paper 0" + "  Your is : " + UserI);
        } else if (comI == 1) {
            System.out.println("Computer choice was Cizzer 1" + "  Your is : " + UserI);
        } else {
            System.out.println("Computer Choice was rock 2" + "  Your is : " + UserI);
        }
    }
}
