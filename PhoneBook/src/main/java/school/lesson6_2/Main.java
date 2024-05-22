package school.lesson6_2;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("+375291223344","Иванов");
        phoneBook.add("+375291910032", "Федоров");
        phoneBook.add("+375293990179", "Иванов");
        phoneBook.add("+375299490204", "Сидоров");
        phoneBook.add("+375296540386", "Смирнов");
        phoneBook.add("+375295070420", "Петров");
        phoneBook.add("+375293950471", "Иванов");

        String surname = "Иванов";
        List<String> phoneNumbers = phoneBook.get(surname);
        System.out.println("Результат поиска для фамилии " + surname + ": ");
        for (String phone: phoneNumbers) {
            System.out.println(phone);
        }
    }
}
