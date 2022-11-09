public class Floor {
    int length;
    int width;

    Floor(int length, int width){
        this.length = length;
        this.width = width;
    }
    void totalTiles(Tile t){
        int tileArea = t.area();
        int floorArea = length * width;
        float numOfTiles = floorArea/tileArea;
        System.out.println("Area Of The Floor:"+floorArea);
        System.out.println("Number Of Tiles Required:"+numOfTiles);


    }
}
