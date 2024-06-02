package school.lesson7.junit5;

public class Main {
    public static void main(String[] args) {

        Factorial factorial = new Factorial();
        int n = factorial.calculationFactorial(5);
        System.out.println("Факториал числа = " + n);
    }
}
