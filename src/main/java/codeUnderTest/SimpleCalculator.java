package codeUnderTest;

import java.text.DecimalFormat;

public class SimpleCalculator {

    public double summarize(double number1, double number2) {
        return (number1 + number2);
    }

    public double deduct(double number1, double number2) {
        return (number1 - number2);
    }

    public double multiply(double number1, double number2) {
        return (number1 * number2);
    }

    public String divide(double number1, double number2) {
        double result = number1 / number2;
        return new DecimalFormat("0.00").format(result);
    }

    public   double remainderDivide(double number1, double number2) {
        return (number1 % number2);
    }
}
