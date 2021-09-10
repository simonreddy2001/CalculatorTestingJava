package no.noroff.nicholas.calculators;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StandardCalculatorTest {

    @Test
    void add_validInputs_ShouldReturnSum() {
        // Arrange
        StandardCalculator calculator = new StandardCalculator();
        double lhs = 1;
        double rhs = 1;
        double expected = lhs + rhs;
        // Act
        double actual = calculator.add(lhs,rhs);
        // Assert
        assertEquals(expected,actual);
    }

    @Test
    void subtract() {
    }

    @Test
    void divide_invalidArgument_ShouldThrowDivideByZeroException() {
        // Arrange
        StandardCalculator calculator = new StandardCalculator();
        double lhs = 1;
        double rhs = 0;
        String expected = "Cant divide by zero";
        // Act & Assert
        Exception exception = assertThrows(ArithmeticException.class, () -> calculator.divide(lhs,rhs) );
        String actual = exception.getMessage();
        assertEquals(expected,actual);
    }

    @Test
    void multiply() {
    }
}