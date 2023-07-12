// Superclass Shape
abstract class Shape {
    abstract double calculateArea();
}

// Subclass Rectangle
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }
}

// Subclass Circle
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Subclass Triangle
class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return 0.5 * base * height;
    }
}

// ShapeCalculator class
class ShapeCalculator {
    public void printArea(Shape shape) {
        double area = shape.calculateArea();
        System.out.println("The area of the shape is: " + area);
    }
}

// Main class
public class ShapeTest {
    public static void main(String[] args) {
        ShapeCalculator calculator = new ShapeCalculator();

        Rectangle rectangle = new Rectangle(5, 7);
        Circle circle = new Circle(3);
        Triangle triangle = new Triangle(4, 6);

        calculator.printArea(rectangle); // Output: The area of the shape is: 35.0
        calculator.printArea(circle);    // Output: The area of the shape is: 28.274333882308138
        calculator.printArea(triangle);  // Output: The area of the shape is: 12.0
    }
}
