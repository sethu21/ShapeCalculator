import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
    Main main = new Main();
    Scanner input = new Scanner(System.in);


    @Test
    void testCalculatePerimeterAndAreaForCircle() {
        Circle circle = new Circle(5.0);
        circle.calculatePerimeter();
        circle.calculateArea();
        assertEquals(31.42, circle.getPerimeter(), 0.01);
        assertEquals(78.54, circle.getArea(), 0.01);
    }

    @Test
    void testCalculatePerimeterAndAreaForRectangle() {
        Rectangle rectangle = new Rectangle(5.0, 10.0);
        rectangle.calculatePerimeter();
        rectangle.calculateArea();
        assertEquals(30.0, rectangle.getPerimeter(), 0.01);
        assertEquals(50.0, rectangle.getArea(), 0.01);
    }

    @Test
    void testCalculatePerimeterAndAreaForSquare() {
        Square square = new Square(5.0);
        square.calculatePerimeter();
        square.calculateArea();
        assertEquals(20.0, square.getPerimeter(), 0.01);
        assertEquals(25.0, square.getArea(), 0.01);
    }

    @Test
    void testStoreAndRetrieveShapes() {
        ArrayList<Shape> shapes = new ArrayList<>();
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(5.0, 10.0);
        Square square = new Square(5.0);
        shapes.add(circle);
        shapes.add(rectangle);
        shapes.add(square);
        Shape retrievedCircle = shapes.get(0);
        Shape retrievedRectangle = shapes.get(1);
        Shape retrievedSquare = shapes.get(2);
        assertEquals(Circle.class, retrievedCircle.getClass());
        assertEquals(Rectangle.class, retrievedRectangle.getClass());
        assertEquals(Square.class, retrievedSquare.getClass());
    }

}