// 6. Create a class Employee with fields Name, Emp ID, result and three assessment values (ass1, 
// ass2 and ass3 (0-100)). If all the assessment values of the employee are above 75, then the 
// result variable should be updated as "Promoted" else "Demoted". Also, calculate and display 
// the total and percentage of the employee using functions.
import java.util.Scanner;

class Main{
    public static void main(String[] args) {

        String Name;
        int Emp_ID, ass1, ass2, ass3;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of the Employee:");
        Name = sc.nextLine();
        System.out.println("Enter the Employee Id:");
        Emp_ID = sc.nextInt();

        System.out.println("Enter Assessment Values(0-100):");

        System.out.println("First Assessment:");
        ass1 = sc.nextInt();
        System.out.println("Second Assessment:");
        ass2 = sc.nextInt();
        System.out.println("Third Assessment:");
        ass3 = sc.nextInt();


        Employee emp = new Employee(Name, Emp_ID, ass1, ass2, ass3);
        emp.display();
        emp.result();
        emp.percentage();
        
        sc.close();
    }
}