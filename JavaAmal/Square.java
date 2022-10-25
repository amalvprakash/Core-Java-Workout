import java.io.*;
import java.util.*;
class Square
{
static void perfectSquares(int l, int r)
{
    for (int i = l; i <= r; i++)
    {
        if (Math.sqrt(i) == (int)Math.sqrt(i))
            System.out.print(i + " ");
    }
}
public static void main (String[] args)
{
    int l, r;
     System.out.print("Enter the limits : ");
     Scanner in = new Scanner(System.in);
     l = in.nextInt();
     r = in.nextInt();
    perfectSquares(l, r);
}
}