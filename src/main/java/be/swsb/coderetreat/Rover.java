package be.swsb.coderetreat;

public class Rover {

    private Rover() {
    }

    public static Rover rover() {
        return new Rover();
    }

    public Position getPosition() {
        return Position.position(0,0);
    }

    public Direction getDirection() {
        return null;
    }
}
