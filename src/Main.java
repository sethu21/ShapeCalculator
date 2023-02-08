import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Shape> shapes = new ArrayList<>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Shape shape = null;
        while (true) {
            System.out.println("[TO Choose Shape Enter : 1]; [Calculate Choose : 2]; [TO Store : 3]; [To Retrieve : 4]; [Exit :5]");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Choose the shape: [ Rectangle :1]; [ Square :2]; [ Circle :3]");
                    int shapeChoice = input.nextInt();
                    switch (shapeChoice) {
                        case 1:
                            System.out.println("Enter the length of the rectangle: ");
                            double length = input.nextDouble();
                            System.out.println("Enter the width of the rectangle: ");
                            double width = input.nextDouble();
                            shape = new Rectangle(length, width);
                            break;
                        case 2:
                            System.out.println("Enter the side of the square: ");
                            double side = input.nextDouble();
                            shape = new Square(side);
                            break;
                        case 3:
                            System.out.println("Enter the radius of the circle: ");
                            double radius = input.nextDouble();
                            shape = new Circle(radius);
                            break;
                        default:
                            System.out.println("Invalid choice. Please choose a valid shape.");
                            break;
                    }
                    break;
                case 2:
                    if (shape == null) {
                        System.out.println("Please choose a shape first.");
                        break;
                    }
                    shape.calculatePerimeter();
                    shape.calculateArea();
                    System.out.println("Perimeter: " + shape.getPerimeter());
                    System.out.println("Area: " + shape.getArea());
                    break;
                case 3:
                    if (shape == null) {
                        System.out.println("Please choose and calculate a shape first.");
                        break;
                    }
                    shapes.add(shape);
                    System.out.println("Shape stored successfully.");
                    shape = null;
                    break;
                case 4:
                    if (shapes.isEmpty()) {
                        System.out.println("No shapes stored yet. Please store a shape first.");
                        break;
                    }
                    System.out.println("Stored shapes: ");
                    for (int i = 0; i < shapes.size(); i++) {
                        System.out.println((i + 1) + ": " + shapes.get(i).getClass().getSimpleName());
                    }
                    System.out.println("Choose a stored shape: ");
                    int storedShapeChoice = input.nextInt();
                    shape = shapes.get(storedShapeChoice - 1);
                    System.out.println("Retrieved " + shape.getClass().getSimpleName() + " successfully.");
                    break;
                case 5:
                    System.out.println("Exiting the program. Thank you ");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
                    break;
            }
        }
    }


    }
