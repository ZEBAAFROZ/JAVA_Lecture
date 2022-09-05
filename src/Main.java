import classes.concepts.abstraction.SwitchBoard;
import classes.concepts.class1.*;
import classes.concepts.interfaces.Shape;

public class Main {

    public static void main(String[] args) {

        // Class Objects
        Rectangle rectangle = new Rectangle(); // Creating class object using default constructor
        rectangle.setLength(10);
        rectangle.setWidth(20);
        System.out.println("Length = " + rectangle.getLength() + ", Width = " + rectangle.getWidth());
        System.out.println("Area = " + rectangle.getArea());

        Rectangle rectangle1 = new Rectangle(5, 10); // Creating class object using parameterized constructor
        System.out.println("Length = " + rectangle1.getLength() + ", Width = " + rectangle1.getWidth());
        System.out.println("Area = " + rectangle1.getArea());

        // Abstraction
        SwitchBoard switchBoard = new Switch();
        switchBoard.on();
        switchBoard.off();
        switchBoard.boardColor();   
        switchBoard.isRegulator();

        // Interface
        Shape shape1 = new Circle(5);
        shape1.shapeName();
        System.out.println("Area = " + shape1.getArea());
        System.out.println("Perimeter = " + shape1.getPerimeter());

        Shape shape2 = new Square(7);
        shape2.shapeName();
        System.out.println("Area = " + shape2.getArea());
        System.out.println("Perimeter = " + shape2.getPerimeter());
    }

}