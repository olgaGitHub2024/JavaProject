package school.lesson4_2;

public class Rectangle implements Shape {
        private double width;
        private double height;
        private String fillColor;
        private String borderColor;

    public Rectangle(double width, double height){
            this.width = width;
            this.height = height;
        }

        @Override
        public double calculatePerimeter() {
            return 2*(width+height);
        }

        @Override
        public double calculateArea() {
            return width*height;
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
            return "Rectangle";
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
