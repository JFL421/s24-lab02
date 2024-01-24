package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Rectangle;
import edu.cmu.cs.cs214.lab02.shapes.Shape;
// import edu.cmu.cs.cs214.lab02.shapes.Circle;
// import edu.cmu.cs.cs214.lab02.shapes.Square;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Rectangle(2, 3);

        Renderer renderer = new Renderer(shape);

        renderer.draw();

        // Shape shape1 = new Circle(2);

        // Renderer renderer1 = new Renderer(shape1);

        // renderer1.draw();

        // Shape shape2 = new Square(3);

        // Renderer renderer2 = new Renderer(shape2);

        // renderer2.draw();
    }
}
