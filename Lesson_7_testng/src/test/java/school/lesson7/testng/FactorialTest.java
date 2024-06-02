package school.lesson7.testng;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class FactorialTest {
    private Factorial factorial;

    @BeforeMethod
    public void setup(){
        factorial = new Factorial();
    }


    @Test(description = "Проверка факториала для положительного числа", priority = 1)
    void factorialPositiveNumber() {

        int actual = factorial.calculationFactorial(5);
        assertEquals (120, actual);
    }


    @Test(description = "Проверка факториала для отрицательного числа", expectedExceptions = IllegalArgumentException.class, priority = 0)
    public void factorialNegativeNumber() {
        int actual = factorial.calculationFactorial(-1);
        assertEquals("Нельзя вычислить факториал отрицательного числа!", actual);

    }

    @DataProvider(name = "numbers")
    public static Object[][] checkNumbers() {

        return new Object[][]{{0, true}, {1, true}};
    }

    @Test(dataProvider = "numbers", description = "Проверка факториала для нуля и единицы", priority = 2)
    public void factorialZeroOrOne(int number, boolean expected)  {
        int actual = factorial.calculationFactorial(number);
        assertEquals(expected, actual == 1);

    }
}
