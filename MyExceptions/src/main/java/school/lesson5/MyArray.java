package school.lesson5;

public class MyArray {
    public static final int MATRIX_SIZE = 4;
    public static int sumArrayItems(String[][] arr) throws MyArrayDataException {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Некорректные данные массива: " + "строка " + i + ", столбец " + j);
                }
            }
        }
        return sum;
    }

    public static void sizeValidation (String[][] arr) throws MyArraySizeException {

        if (arr.length != MATRIX_SIZE) {
            throw new MyArraySizeException("Неправильный размер массива! количество строк = " + arr.length);
        }
        for (int i = 0; i < MATRIX_SIZE; i++) {
            if (arr[i].length != MATRIX_SIZE) {
                throw new MyArraySizeException("Неправильный размер массива! Количество столбцов = " + arr[i].length);
            }
        }
    }

}

