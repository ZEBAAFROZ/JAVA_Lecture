package classes.concepts.class1;

public class Rectangle {
    int length;
    int width;

    // Default Constructor
    public Rectangle() {
        System.out.println("Creating Default Rectangle Object");
    }

    // Parameterized Constructor
    public Rectangle(int length, int width) {
        this.length = length; // this refers to current class
        this.width = width;
        System.out.println("Creating Rectangle Object with parameters");
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getArea() {
        return length * width;
    }



}
