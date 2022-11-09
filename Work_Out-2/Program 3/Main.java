import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MathFunction mul = new MathFunction();

        System.out.println("Enter Both Integers Values:");
        mul.multiply(sc.nextInt(),sc.nextInt());


        System.out.println("Enter Both Floating Point Values:");
        mul.multiply(sc.nextFloat(),sc.nextFloat());

        System.out.println("Enter One Integer value and One Floating Point Values:");
        mul.multiply(sc.nextInt(),sc.nextFloat());

        sc.close();
    }
}
