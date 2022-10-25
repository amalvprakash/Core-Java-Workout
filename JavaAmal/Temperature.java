import java.util.Scanner;
public class Temperature 
{
  public static void main(String[] args)
  {
        float f,c;
        System.out.print("Enter the temperature in Fahrenheit : ");
    	Scanner in = new Scanner(System.in);
    	f = in.nextFloat();
    	c=((f-32)*5)/9;
	System.out.println("Temperature in Celsius is "+c);
  }
}