
import com.calculator.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private Calculator calc;
    @BeforeEach
    public void setUp(){
        calc=new Calculator();
    }
    @Nested
    public class CalculatingAdditionFunction {
        @BeforeEach
        public void setUp() {
            calc = new Calculator();
        }

        @Test
        public void additionOfTwentyAndTenGivesEight() {
            setUp();
            double result = calc.add(20, 10);
            double expected = 30;
            Assertions.assertEquals(result, expected);
        }

        @Test
        public void additionOfFiveAndTen() {
            setUp();
            double result = calc.add(5, 10);
            double expected = 15;
            Assertions.assertEquals(result, expected);
        }
    }
    @Nested
    public class CalculatingSubtractionFunction {
        @BeforeEach
        public void setUp() {
            calc = new Calculator();
        }

        @Test
        public void subtractionOfTwentyAndTenGivesTen() {
            setUp();
            double result = calc.sub(20, 10);
            double expected = 10;
            Assertions.assertEquals(result, expected);
        }

        @Test
        public void subtractionOfFiveAndTenGivesMinusFive() {
            setUp();
            double result = calc.sub(5, 10);
            double expected = -5;
            Assertions.assertEquals(result, expected);
        }
    }
    @Nested
    public class CalculatingMultiplicationFunction {
        @BeforeEach
        public void setUp() {
            calc = new Calculator();
        }

        @Test
        public void MultiplicationOfTwentyAndTenGivesTwoHundred() {
            setUp();
            double result = calc.mul(20, 10);
            double expected = 200;
            Assertions.assertEquals(result, expected);
        }

        @Test
        public void MultiplicationOfFiveAndTenGivesFifty() {
            setUp();
            double result = calc.mul(5, 10);
            double expected = 50;
            Assertions.assertEquals(result, expected);
        }
    }
    @Nested
    public class CalculatingDivisionFunction {
        @BeforeEach
        public void setUp() {
            calc = new Calculator();
        }

        @Test
        public void DivisionOfTwentyByTenGivesTwo() {
            setUp();
            double result = calc.div(20, 10);
            double expected = 2;
            Assertions.assertEquals(result, expected);
        }

        @Test
        public void DivisionOfFiveByZeroGivesException() {
            setUp();
            Assertions.assertThrows(ArithmeticException.class, () -> calc.div(5,0));
        }
    }

}
