package be.swsb.coderetreat;

import static be.swsb.coderetreat.Position.position;

public class Rover {

    private Position position;
    private Direction direction;

    private Rover(final Direction direction) {
        this.direction = direction;
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
        return direction;
    }

    public void forward() {
        if (Direction.NORTH.equals(this.getDirection())) {
            this.position = position.incrementY();
        } else {
            this.position = position.incrementX();
        }
    }

    public void backward() {
        this.position = position.decrementY();
    }
}
