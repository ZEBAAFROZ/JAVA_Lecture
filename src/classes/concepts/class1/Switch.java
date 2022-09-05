package classes.concepts.class1;

import classes.concepts.abstraction.SwitchBoard;

public class Switch extends SwitchBoard {


    public void on() {
        System.out.println("Complete the circuit");
    }

    @Override
    public void off() {
        System.out.println("Break the circuit");
    }

    @Override
    public void boardColor() {
        System.out.println("My Switch Board color is BLACK");
        super.boardColor(); // super refers to Parent class
    }
}
