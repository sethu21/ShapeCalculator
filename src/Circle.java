public class Circle extends Shape{
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void calculatePerimeter() {
        setPerimeter(2 * Math.PI * radius);
    }

    public void calculateArea() {
        setArea(Math.PI * radius * radius);
    }
}
