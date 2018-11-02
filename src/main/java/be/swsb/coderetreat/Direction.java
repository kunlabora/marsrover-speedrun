package be.swsb.coderetreat;

import java.util.HashMap;

public enum Direction {
    NORTH,
    EAST,
    SOUTH,
    WEST;

    private static HashMap<Direction, Direction> counterClockwiseMap = new HashMap<>();

    static {
        counterClockwiseMap.put(NORTH, Direction.WEST);
        counterClockwiseMap.put(EAST, Direction.NORTH);
        counterClockwiseMap.put(SOUTH, Direction.EAST);
        counterClockwiseMap.put(WEST, Direction.SOUTH);
    }

    private static HashMap<Direction, Direction> clockwiseMap = new HashMap<>();

    static {
        clockwiseMap.put(NORTH, Direction.EAST);
        clockwiseMap.put(EAST, Direction.SOUTH);
        clockwiseMap.put(SOUTH, Direction.WEST);
        clockwiseMap.put(WEST, Direction.NORTH);
    }

    public Direction counterClockwise() {
        return counterClockwiseMap.get(this);
    }

    public Direction clockwise() {
        return clockwiseMap.get(this);
    }
}
