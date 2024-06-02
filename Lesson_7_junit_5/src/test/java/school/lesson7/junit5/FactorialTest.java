package school.lesson7.junit5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FactorialTest {
    private Factorial factorial;

    @BeforeEach
    public void setup(){
        factorial = new Factorial();
    }

    @Test
    @DisplayName("Проверка факториала для положительного числа")
    void calculationFactorial() {
        int actual = factorial.calculationFactorial(5);
        assertEquals(120, actual);
    }

    @ParameterizedTest
    @ValueSource(ints = {0,1})
    @DisplayName("Проверка факториала для нуля и единицы")
    public void factorialZeroOrOne(int num){
        int actualForZeroOrOne = factorial.calculationFactorial(num);       ;
        assertEquals(1, actualForZeroOrOne);
    }

    @Test
    @DisplayName("Проверка факториала для отрицательного числа")
    public void factorialNegative() {
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class,
                () -> factorial.calculationFactorial(-1));
        assertEquals("Нельзя вычислить факториал отрицательного числа!", thrown.getMessage());
    }

}
