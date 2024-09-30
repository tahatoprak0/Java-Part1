package hesap_makinesi;

import java.util.Scanner;

public class Calculator {
    String name;
    int firstArgument;
    int secondArgument;
    double result;
    char operation;

    CalculatorFunction calculatorFunction = new CalculatorFunction();

    public void whoIsThat(){
        System.out.println("I'm a calculator that can do 4 operations ");
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public int getFirstArgument() {
        return firstArgument;
    }

    public void setFirstArgument(int newFirstArgument) {
        firstArgument = newFirstArgument;
    }

    public int getSecondArgument() {
        return secondArgument;
    }

    public void setSecondArgument(int newSecondArgument) {
        secondArgument = newSecondArgument;
    }

    public char getOperation() {
        return operation;
    }

    public void setOperation(char newOperation) {
        operation = newOperation;
    }

    public double getResult() {
        switch (operation) {

            case '+':
                result = calculatorFunction.add(firstArgument, secondArgument);
                break;

            case '-':
                result = calculatorFunction.substract(firstArgument, secondArgument);
                break;

            case '*':
                result = calculatorFunction.multiply(firstArgument, secondArgument);
                break;

            case '/':
                result = calculatorFunction.divide(firstArgument, secondArgument);
                break;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        Calculator calculator = new Calculator();
        calculator.whoIsThat();
        System.out.println("Birinci sayıyı girin");
        int firstArgument = giris.nextInt();
        System.out.println("İkinci sayıyı girin");
        int secondArgument = giris.nextInt();

        calculator.setFirstArgument(firstArgument);
        calculator.setSecondArgument(secondArgument);
        System.out.println("/, *, +, - ");
        char operation = giris.next().charAt(0);
        calculator.setOperation(operation);
        double result = calculator.getResult();
        System.out.println("Result:" + result);
        System.out.println(firstArgument+" "+operation+" "+secondArgument+" = "+result);
    }


}
