class TwoBHK extends OneBHK{
    float room2Area;
    TwoBHK(float roomArea, float hallArea, float price, float room2Area){
        super(roomArea, hallArea, price);
        this.room2Area = room2Area;
    }
    void show(){
        super.show();
        System.out.println("Area Of The Second Room:"+room2Area);
        }
}


