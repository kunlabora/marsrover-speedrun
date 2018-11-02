package be.swsb.coderetreat;

import org.junit.jupiter.api.Test;

import static be.swsb.coderetreat.Position.position;
import static org.assertj.core.api.Assertions.assertThat;

class PositionTest {

    @Test
    void incrementY_ReturnsNewPositionWithYIncremented() {
        final Position position = position(0, 1);

        assertThat(position.incrementY()).isEqualTo(position(0, 2));
    }
    @Test
    void decrementY_ReturnsNewPositionWithYDecremented() {
        final Position position = position(0, 1);

        assertThat(position.decrementY()).isEqualTo(position(0, 0));
    }

    @Test
    void incrementX_ReturnsNewPositionWithXIncremented() {
        final Position position = position(0, 1);

        assertThat(position.incrementX()).isEqualTo(position(1, 1));
    }
}