import java.util.Scanner;

class Swap{
    int a, b, temp;
    Swap(int a, int b){
        this.a = a;
        this.b = b;
    }
    void callByValuve(){
        int temp = a;
        a = b;
        b = temp; 
        System.out.println("after Swapping:\na = "+a+"\nb = "+b);
    }
    public static void main(String[] args) {
        int a, b, option;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The First Number:");
        a = sc.nextInt();
        System.out.println("Enter The Second Number:");
        b = sc.nextInt(); 

        System.out.println("Before Swapping: \na = "+a+"\nb = "+b);
        
        System.out.println("Choose an Option:\n1:Call By Valuve\n2:Call BY Reference");
        option = sc.nextInt(); 

        if(option==1){
            Swap s = new Swap(a, b);
            s.callByValuve();
        }

       
    }
}