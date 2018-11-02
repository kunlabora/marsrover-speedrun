package be.swsb.coderetreat;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RoverTest {

    @Test
    void constructor_MarsRoverIsInitializedAtPosition00() throws Exception {
        assertThat(new Rover().getPosition()).isEqualTo(new Position(0,0));
    }
}