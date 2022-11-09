class PartTimeFaculty extends Faculty {
    int hour;
    float rate;

    PartTimeFaculty(int hour, float rate){
        this.hour = hour;
        this.rate = rate;
    }
    float getSalaryPartTime(){
        float salary;
        salary = (hour*rate);
        return salary;
    }
    void display(){
        System.out.println(getSalaryPartTime());
    }

}
