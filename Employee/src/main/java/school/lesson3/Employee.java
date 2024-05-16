package school.lesson3;

public class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return ("ФИО: " + name + "\n"
                + "Должность: " + position + "\n"
                + "Email: " + email + "\n"
                + "Телефон: " + phone + "\n"
                + "Зарплата: " + salary + "\n"
                + "Возраст: " + age + "\n");
    }

    public void print() {
        System.out.println(this);
    }
}
