class OneBHK{
    float roomArea, hallArea, price;
    
    OneBHK(){
        }
    OneBHK(float roomArea, float hallArea, float price){
        this.roomArea = roomArea;
        this.hallArea = hallArea;
        this.price = price;    
        }
    void show(){
        System.out.println("Area Of The Room:"+roomArea+
        "\nArea Of The Hall:"+hallArea+
        "\nPrice of The Flat:"+price);
        }
    }