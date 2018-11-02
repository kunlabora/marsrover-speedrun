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

    public Direction counterClockwise() {
        return counterClockwiseMap.get(this);
    }
}
