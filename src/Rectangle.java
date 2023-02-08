public class Rectangle extends Shape{
    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void calculatePerimeter() {
        setPerimeter(2 * (length + width));
    }

    public void calculateArea() {
        setArea(length * width);
    }
}
