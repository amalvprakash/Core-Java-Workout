public class CountInstance {
    static int count, destroyed=0;


    CountInstance(){
        count++;
    }

    protected void finalize(){
        destroyed++;
    }
    public static void main(String[] args) {
        CountInstance c1 = new CountInstance();
        CountInstance c2 = new CountInstance();
        CountInstance c3 = new CountInstance();
        CountInstance c4 = new CountInstance();
        CountInstance c5 = new CountInstance();

        System.out.println("total Number Of Instances Created:"+CountInstance.count);
        c1.finalize();
        c1=null;
        System.gc();
        System.out.println("total Number Of Instances Destroyed:"+CountInstance.destroyed);

    }
    
}
