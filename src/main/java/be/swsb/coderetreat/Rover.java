package be.swsb.coderetreat;

import static be.swsb.coderetreat.Position.position;

public class Rover {

    private Position position;

    private Rover() {
        this.position = position(0, 0);
    }

    public static Rover rover() {
        return new Rover();
    }

    public Position getPosition() {
        return position;
    }

    public Direction getDirection() {
        return Direction.NORTH;
    }

    public void forward() {
        this.position = position.addY();
    }
}
