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
        } else if (Direction.EAST.equals(this.getDirection())) {
            this.position = position.incrementX();
        } else if (Direction.SOUTH.equals(this.getDirection())) {
            this.position = position.decrementY();
        } else if (Direction.WEST.equals(this.getDirection())) {
            this.position = position.decrementX();
        }
    }

    public void backward() {
        if (Direction.NORTH.equals(this.getDirection())) {
            this.position = position.decrementY();
        } else if (Direction.EAST.equals(this.getDirection())) {
            this.position = position.decrementX();
        } else if (Direction.SOUTH.equals(this.getDirection())) {
            this.position = position.incrementY();
        } else if (Direction.WEST.equals(this.getDirection())) {
            this.position = position.incrementX();
        }
    }

    public void left() {

    }
}
