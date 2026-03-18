import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double distanceInFeet;

        System.out.print("Enter distance in feet: ");
        distanceInFeet = sc.nextDouble();

        double yards = distanceInFeet / 3;
        double miles = yards / 1760;

        System.out.println("Distance in yards: " + yards);
        System.out.println("Distance in miles: " + miles);
    }
}