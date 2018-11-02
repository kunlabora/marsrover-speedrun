package be.swsb.coderetreat;

import static be.swsb.coderetreat.Position.position;

public class Rover {

    private Position position;

    private Rover(final Direction direction) {
        this.position = position(0, 0);
    }

    public static Rover rover() {
        return new Rover(Direction.NORTH);
    }

    public static Rover rover(final Direction direction) {
        return new Rover(direction);
    }

    public Position getPosition() {
        return position;
    }

    public Direction getDirection() {
        return Direction.NORTH;
    }

    public void forward() {
        this.position = position.incrementY();
    }

    public void backward() {
        this.position = position.decrementY();
    }
}
