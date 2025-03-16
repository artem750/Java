package laba2.Example5;

public class Rectangle {
    private double length;
    private double width;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double calculateArea() {
        return length * width;
    }
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return "Rectangle{length=" + length + ", width=" + width + "}";
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5.0, 3.0);
        System.out.println(rectangle);
        System.out.println("Площадь: " + rectangle.calculateArea());
        System.out.println("Периметр: " + rectangle.calculatePerimeter());
        rectangle.setLength(7.0);
        rectangle.setWidth(4.0);
        System.out.println(rectangle);
        System.out.println("Площадь после изменения: " + rectangle.calculateArea());
        System.out.println("Периметр после изменения: " + rectangle.calculatePerimeter());
    }
}

