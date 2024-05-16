package school.lesson3_2;

public class Main {
    public static void main(String[] args) {
        int count = 1;
        Person[] persArray = new Person[5];

        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Person("Fedorov Victor", "Director", "fedorov@mailbox.com", "+375293958832",890000,51);
        persArray[2] = new Person("Smirnov Sergey", "Engineer", "smirnov@mailbox.com", "+375295778899",450000,35);
        persArray[3] = new Person("Petrov Nicolay", "Designer", "petrov@@mailbox.com", "+375(29)6505050",700200,42);
        persArray[4] = new Person("Mihailova Nataly", "Manager", "mihailova@mailbox.com", "+375292543791",237000,25);

        for (Person person: persArray) {
            System.out.println("Информация об сотруднике "+ count+ ":\n" + person);
            count ++;
        }

    }
}
