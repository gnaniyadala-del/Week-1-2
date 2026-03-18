import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double base, height;

        System.out.print("Enter base in cm: ");
        base = sc.nextDouble();

        System.out.print("Enter height in cm: ");
        height = sc.nextDouble();

        double areaCm = 0.5 * base * height;

        // Convert cm to inches (1 inch = 2.54 cm)
        double areaInch = areaCm / (2.54 * 2.54);

        System.out.println("Area in sq cm: " + areaCm);
        System.out.println("Area in sq inches: " + areaInch);
    }
}