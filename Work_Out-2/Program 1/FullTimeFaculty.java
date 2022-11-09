class FullTimeFaculty extends Faculty {
    float basic;
    float allowance;

    FullTimeFaculty(float basic, float allowance){
        this.basic = basic;
        this.allowance = allowance;
    }
    float getSalary(){
        float salary;
        salary = basic+allowance;
        return salary;
    }
    void display(){
        System.out.println(getSalary());
    }
}
