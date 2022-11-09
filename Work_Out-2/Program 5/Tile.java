class Tile{
    int edgeLength;
    int tileArea;

    Tile(int edgeLength){
        this.edgeLength = edgeLength;
        // this.tileArea = tileArea;
    }
    int area(){
        tileArea = edgeLength*edgeLength;
        return tileArea;
    }
}