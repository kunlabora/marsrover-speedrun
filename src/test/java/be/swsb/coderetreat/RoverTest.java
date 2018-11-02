package be.swsb.coderetreat;

import org.junit.jupiter.api.Test;

import static be.swsb.coderetreat.Position.position;
import static be.swsb.coderetreat.Rover.rover;
import static org.assertj.core.api.Assertions.assertThat;

class RoverTest {

    @Test
    void constructor_MarsRoverIsInitializedAtPosition00() throws Exception {
        assertThat(rover().getPosition()).isEqualTo(position(0,0));
    }

    @Test
    void constructor_MarsRoverIsInitializedFacingNorth() throws Exception {
        assertThat(rover().getDirection()).isEqualTo(Direction.NORTH);
    }
}