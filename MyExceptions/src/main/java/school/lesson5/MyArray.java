package school.lesson5;

public class MyArray {
    public static int sumArrayItems(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;

        if (arr.length != 4) throw new MyArraySizeException("Неправильный размер массива! количество строк = " + arr.length);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) throw new MyArraySizeException("Неправильный размер массива! Количество столбцов = " + arr[i].length);
            for (int j = 0; j < arr.length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Некорректные данные массива: " + "строка " + i + ", столбец " + j);
                }
            }
        }
        return sum;
    }
}