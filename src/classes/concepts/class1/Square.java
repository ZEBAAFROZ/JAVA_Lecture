package classes.concepts.class1;

import classes.concepts.interfaces.Shape;

public class Square implements Shape {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public void shapeName() {
        System.out.println("Iam a Square");
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4*side;
    }

    public void setSide(int side) {
        this.side = side;
    }
}
