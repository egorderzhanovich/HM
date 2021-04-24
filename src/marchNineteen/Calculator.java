package HM.marchNineteen;

public class Calculator {
    private double operand1;
    private double operand2;

    public Calculator(double operand1, double operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    public double getOperand1() {
        return operand1;
    }

    public void setOperand1(double operand1) {
        this.operand1 = operand1;
    }

    public double getOperand2() {
        return operand2;
    }

    public void setOperand2(double operand2) {
        this.operand2 = operand2;
    }

    public double addition(){
        return getOperand1()+getOperand2();
    }
    public double division(){
        return getOperand1()/getOperand2();
    }
    public double subtraction(){
        return getOperand1()-getOperand2();
    }
    public double multiplication(){
        return getOperand1()*getOperand2();
    }
}
