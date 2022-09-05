package classes.concepts.abstraction;

public abstract class SwitchBoard {

    public abstract void on();
    public abstract void off();

    public void boardColor() {
        System.out.println("My SwitchBoard is White Color!");
    }

    public void isRegulator() {
        System.out.println("This switchboard contains a Fan regulator");
    }

}
