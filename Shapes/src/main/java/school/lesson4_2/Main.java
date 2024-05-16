package school.lesson4_2;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.setFillColor("green");
        circle.setBorderColor("grey");
        circle.printCharacteristics();
        System.out.println();

        Rectangle rectangle = new Rectangle(7, 3);
        rectangle.setFillColor("red");
        rectangle.setBorderColor("pink");
        rectangle.printCharacteristics();
        System.out.println();

        Triangle triangle = new Triangle(1.99, 2.98, 3.65);
        triangle.setFillColor("blue");
        triangle.setBorderColor("white");
        triangle.printCharacteristics();

    }
}
