class Employee {
    String Name, result;
    int Emp_ID, ass1, ass2, ass3;

    Employee(String Name, int Emp_ID, int ass1, int ass2, int ass3 ){
        this.Name = Name;
        this.Emp_ID = Emp_ID;
        this.ass1 = ass1;
        this.ass2 = ass2;
        this.ass3 = ass3;
    }
    void display(){
        System.out.println("Name Of The Employee:"+Name);
        System.out.println("Employee ID:"+Emp_ID);

    }
    void result(){
        if((ass1>=75) && (ass2>=75) && (ass3>=75)){
            result = "Promoted";
        }else{
            result = "Deomoted";
        }
        System.out.println("Result Status:"+result);
    }
    void percentage(){
        int totalScore = ass1+ass2+ass3;
        float percentage = (totalScore*100)/300;
        System.out.println("Total Assessment Score:"+totalScore+"\nPercentage:"+percentage);
    }
}
