// Create a class Tile to store the edge length of a square tile, and create another class Floor to 
// store the length and width of a rectangular floor. Add method totalTiles(Tile t) in Floor class 
// with Tile as an argument to calculate the whole number of tiles needed to cover the floor 
// completely

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int length, width;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Side Length of The Tile:");
        Tile t = new Tile(sc.nextInt());
    

        System.out.println("Enter The Length of The Room:");
        length = sc.nextInt();

        System.out.println("Enter The width of The Room:");
        width = sc.nextInt();

        Floor f = new Floor(length,width);

        System.out.println("Area of the tile:"+t.area());
        f.totalTiles(t);

        sc.close();
    }
}
