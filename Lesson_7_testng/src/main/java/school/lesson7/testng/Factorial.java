package school.lesson7.testng;

public class Factorial {

    public int calculationFactorial (int n){
        if (n < 0){
            throw new IllegalArgumentException("Нельзя вычислить факториал отрицательного числа!");
        } else if (n==0 || n==1){
            return 1;
        } else
            return n * calculationFactorial(n-1);
    }
}
