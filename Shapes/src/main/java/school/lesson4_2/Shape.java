package school.lesson4_2;

public interface Shape {
    double calculatePerimeter();
    double calculateArea();
    void setBorderColor(String color);
    void setFillColor(String color);
    String getShapeName();
    String getBorderColor();
    String getFillColor();

    default void printCharacteristics(){
        System.out.println(getShapeName());
        System.out.println("Perimeter: " + calculatePerimeter());
        System.out.println("Area: " + calculateArea());
        System.out.println("Fill color: " + getFillColor());
        System.out.println("Border color: " + getBorderColor());
    }
}
