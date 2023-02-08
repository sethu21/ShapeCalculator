import java.util.ArrayList;
import java.util.Scanner;

public abstract class Shape {
    double perimeter;
    double area;

    public abstract void calculatePerimeter();
    public abstract void calculateArea();

    public void setPerimeter(double perimeter) {
        if (perimeter <= 0) {
            System.out.println("Invalid value. Perimeter cannot be 0 or below 0.");
            return;
        }
        this.perimeter = perimeter;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setArea(double area) {
        if (area <= 0) {
            System.out.println("Invalid value. Area cannot be 0 or below 0.");
            return;
        }
        this.area = area;
    }

    public double getArea() {
        return area;
    }
}

