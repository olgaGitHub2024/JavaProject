package school.lesson5;

public class Main {

    public static void main(String[] args) {

        String[][] arr = {
                {"1", "2", "3", "3"},
                {"1", "1", "2", "2"},
                {"3", "4dd", "3", "3"},
                {"1", "1", "3", "3"}
        };

        try {
            MyArray.sizeValidation(arr);
            System.out.println("Cумма элементов массива = " + MyArray.sumArrayItems(arr));
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }
}
