package school.lesson3;

public class Main {
    public static void main(String[] args) {
        Employee[] emp = new Employee[5];
        emp[0] = new Employee("Fedorov Victor", "Director", "fedorov@gmail.com", "+375293958832",890000,51);
        emp[1] = new Employee("Smirnov Sergey", "Engineer", "smirnov@gmail.com", "+375295778899",450000,35);
        emp[2] = new Employee("Petrov Nicolay", "Designer", "petrov@@gmail.com", "+375(29)6505050",700200,42);
        emp[3] = new Employee("Ivanova Inna", "Еconomist", "ivanova@gmail.com", "+375291899509",589000,37);
        emp[4] = new Employee("Mihailova Nataly", "Manager", "mihailova@gmail.com", "+375292543791",237000,25);

        for (int i = 0; i < emp.length; i++)
            emp[i].print();
    }
}
