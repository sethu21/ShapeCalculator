public class Square extends Shape{
    double side;

    public Square(double side) {
        this.side = side;
    }

    public void calculatePerimeter() {
        setPerimeter(4 * side);
    }

    public void calculateArea() {
        setArea(side * side);
    }
}
