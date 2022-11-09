import java.util.Scanner;
public class Main {
public static void main(String[] args) {
    System.out.println("Salary Calculator");
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter the Full Time Faculty Details:(Basic|Allowance)");
    
    FullTimeFaculty f1 = new FullTimeFaculty(sc.nextFloat(), sc.nextFloat());
    FullTimeFaculty f2 = new FullTimeFaculty(sc.nextFloat(), sc.nextFloat());

    System.out.println("Enter the Part Time Faculty Details:(Hour|Rate)");
    
    PartTimeFaculty p1 = new PartTimeFaculty(sc.nextInt(), sc.nextFloat());
    PartTimeFaculty p2 = new PartTimeFaculty(sc.nextInt(), sc.nextFloat());
    f1.display();
    f2.display();
    p1.display();
    p2.display();
    sc.close();
    }
}
