import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Details of First Flat:");
        TwoBHK flat1 = new TwoBHK(sc.nextFloat(), sc.nextFloat(), sc.nextFloat(), sc.nextFloat());
        System.out.println("Enter the Details of Second Flat:");
        TwoBHK flat2 = new TwoBHK(sc.nextFloat(), sc.nextFloat(), sc.nextFloat(), sc.nextFloat());
        System.out.println("Enter the Details of Third Flat:");
        TwoBHK flat3 = new TwoBHK(sc.nextFloat(), sc.nextFloat(), sc.nextFloat(), sc.nextFloat());

        flat1.show();
        flat2.show();
        flat3.show();
        sc.close();
    }
}
