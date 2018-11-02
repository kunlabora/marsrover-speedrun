package be.swsb.coderetreat;

import org.junit.jupiter.api.Test;

import static be.swsb.coderetreat.Position.position;
import static org.assertj.core.api.Assertions.assertThat;

class PositionTest {

    @Test
    void addY_ReturnsNewPositionWithYIncremented() {
        final Position position = position(0, 1);

        assertThat(position.addY()).isEqualTo(position(0, 2));
    }
}