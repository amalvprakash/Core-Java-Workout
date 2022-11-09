class MathFunction{
    int intNum1, intNum2;
    float floatNum1, floatNum2;

    void multiply(int intNum1, int intNum2){
        System.out.println(intNum1*intNum2);
    }
    void multiply(float floatNum1, Float floatNum2){
        System.out.println(floatNum1*floatNum2);
    }
    void multiply(int intNum1, float floatNum1){
        System.out.println(intNum1*floatNum1);
    }
}