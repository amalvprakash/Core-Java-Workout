public class CountInstance {
    static int count=0, destroyed=0;


    CountInstance(){
        this.count++;
    }
    @Override
    protected void finalize()throws Throwable{
        destroyed++;
    }
    public static void main(String[] args) {
        CountInstance c1 = new CountInstance();
        CountInstance c2 = new CountInstance();
        CountInstance c3 = new CountInstance();
        CountInstance c4 = new CountInstance();
        CountInstance c5 = new CountInstance();

        c1=null;
        System.gc();
        Runtime.getRuntime().gc();
        
        System.out.println("total Number Of Instances Created:"+count);
        System.out.println("total Number Of Instances Destroyed:"+destroyed);
        System.out.println("Number Of Instances Alive:"+(count-destroyed));    

    }
    
}
