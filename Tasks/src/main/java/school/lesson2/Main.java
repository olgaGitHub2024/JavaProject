package school.lesson2;

public class Main {

    public static void main(String[] args) {
        System.out.println("Задача 1 - метод printThreeWords()");
        printThreeWords();
        System.out.println();

        System.out.println("Задача 2 - метод  checkSumSign()");
        checkSumSign();
        System.out.println();

        System.out.println("Задача 3 - метод printColor()");
        printColor();
        System.out.println();

        System.out.println("Задача 4 - метод compareNumbers()");
        compareNumbers();
        System.out.println();

        System.out.println("Задача 5");
        System.out.println(checkAmount(35, 7));
        System.out.println();

        System.out.println("Задача 6");
        printInConsole(67);
        System.out.println();

        System.out.println("Задача 7");
        System.out.println(checkForInteger(-17));
        System.out.println();

        System.out.println("Задача 8");
        printLines("hello", 3);
        System.out.println();

        System.out.println("Задача 9");
        System.out.println(checkLeapYear(2024));
        System.out.println();

        System.out.println("Задача 10");
        replacementArray();
        System.out.println();

        System.out.println("Задача 11");
        fillingArray();
        System.out.println();

        System.out.println("Задача 12");
        сheckArray();
        System.out.println();

        System.out.println("Задача 13");
        fillingDiagonal();
        System.out.println();

        System.out.println("Задача 14");
        System.out.println("Результат:");
        printArray( initializationArray(5, 3));


    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 1;
        int b = 2;
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 0;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 9;
        int b = 2;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static boolean checkAmount(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void printInConsole(int a) {
        if (a >= 0) {
            System.out.println("Число " + a + " положительное");
        } else {
            System.out.println("Число " + a + " отрицательное");
        }
    }

    public static boolean checkForInteger(int a) {
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void printLines(String str, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(str);
        }
    }

    public static boolean checkLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        }
        if (year % 100 == 0) {
            return false;
        }
        if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void replacementArray() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Начальный массив:");
        printArray(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
        System.out.println("Результат:");
        printArray(arr);
    }

    public static void fillingArray() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        System.out.println("Результат:");
        printArray(array);
    }

    public static void сheckArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Начальный массив:");
        printArray(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        System.out.println("Результат:");
        printArray(arr);
    }

    public static void fillingDiagonal() {
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            arr[i][arr.length - 1 - i] = 1;
        }
        System.out.println("Результат:");
        for (int i = 0; i < arr.length; i++) {
            printArray(arr[i]);
        }
    }

    public static int[] initializationArray(int len, int initialValue) {
        int arr[] = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }

    public static void printArray(int[] array) {
        for (int item: array) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}




