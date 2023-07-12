// Interface Drawable
interface Drawable {
    void draw();
}

// Class Circle implementing the Drawable interface
class Circle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

// Class Rectangle implementing the Drawable interface
class Rectangle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

// Main class
public class DrawableTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();

        circle.draw();      // Output: Drawing a circle
        rectangle.draw();   // Output: Drawing a rectangle
    }
}
