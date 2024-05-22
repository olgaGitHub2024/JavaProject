package school.lesson4_2;

public class Circle implements Shape {
        private double radius;
        private String fillColor;
        private String borderColor;

    public Circle (double radius){
            this.radius = radius;
        }

        @Override
        public double calculatePerimeter() {
            return 2*Math.PI*radius;
        }

        @Override
        public double calculateArea() {
            return Math.PI*radius*radius;
        }

        @Override
        public void setFillColor(String color) {
            this.fillColor = color;
        }

        @Override
        public void setBorderColor(String color) {
            this.borderColor = color;
        }

        @Override
        public String getShapeName() {
            return "Circle";
        }

        @Override
        public String getBorderColor() {
            return borderColor;
        }

        @Override
        public String getFillColor() {
            return fillColor;
        }

 }
