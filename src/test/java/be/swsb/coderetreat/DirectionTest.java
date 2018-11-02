package be.swsb.coderetreat;

import org.junit.jupiter.api.Test;

import static be.swsb.coderetreat.Direction.*;
import static org.assertj.core.api.Assertions.assertThat;

class DirectionTest {

    @Test
    void counterClockwise() {
        assertThat(NORTH.counterClockwise()).isEqualTo(WEST);
        assertThat(WEST.counterClockwise()).isEqualTo(SOUTH);
        assertThat(SOUTH.counterClockwise()).isEqualTo(EAST);
        assertThat(EAST.counterClockwise()).isEqualTo(NORTH);
    }
}