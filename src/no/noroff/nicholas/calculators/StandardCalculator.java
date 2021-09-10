package no.noroff.nicholas.calculators;

public class StandardCalculator {

    public double add(double lhs, double rhs) {
        return 0;
    }
    public double subtract(double lhs, double rhs) {
        return 0;
    }
    public double divide(double lhs, double rhs) {
        if(rhs == 0) {
            throw new ArithmeticException("Cant divide by zero");
        }
        return 0;
    }
    public double multiply(double lhs, double rhs) {
        return 0;
    }

}
