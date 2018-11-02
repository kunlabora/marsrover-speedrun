package be.swsb.coderetreat;

import java.util.Objects;

public class Position {
    private final int x;
    private final int y;

    private Position(final int x, final int y) {
        this.x = x;
        this.y = y;
    }

    public static Position position(final int x, final int y) {
        return new Position(x, y);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Position position = (Position) o;
        return x == position.x &&
                y == position.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "Position{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public Position incrementY() {
        return position(this.x, this.y + 1);
    }

    public Position decrementY() {
        return position(this.x, this.y - 1);
    }

    public Position incrementX() {
        return position(this.x + 1, this.y);
    }

    public Position decrementX() {
        return position(this.x - 1, this.y);
    }
}
