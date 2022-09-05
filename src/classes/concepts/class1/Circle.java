package classes.concepts.class1;

import classes.concepts.interfaces.Shape;

public class Circle implements Shape {

    private final float pi = 3.14f; // Constant value i.e we cant change the variable value
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void shapeName() {
        System.out.println("Iam a Circle");
    }

    @Override
    public double getArea() {
        return pi* radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2*pi* radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
