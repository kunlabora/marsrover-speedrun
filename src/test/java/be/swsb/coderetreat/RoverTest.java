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

    @Test
    void forwards_InitialRover_MovesUpTheYAxis() {
        final Rover rover = rover();
        rover.forward();

        assertThat(rover.getPosition()).isEqualTo(position(0, 1));
    }

    @Test
    void forwards_InitialRover_ForwardsTwice_MovesUpTheYAxisTwice() {
        final Rover rover = rover();
        rover.forward();
        rover.forward();

        assertThat(rover.getPosition()).isEqualTo(position(0, 2));
    }

    @Test
    void backwards_InitialRover_MovesDownTheYAxis() {
        final Rover rover = rover();
        rover.backward();

        assertThat(rover.getPosition()).isEqualTo(position(0, -1));
    }

    @Test
    void backwards_InitialRover_BackwardsTwice_MovesDownTheYAxisTwice() {
        final Rover rover = rover();
        rover.backward();
        rover.backward();

        assertThat(rover.getPosition()).isEqualTo(position(0, -2));
    }

    @Test
    void forwards_RoverFacingEast_MovesUpTheXAxis() {
        final Rover rover = rover(Direction.EAST);
        rover.forward();

        assertThat(rover.getPosition()).isEqualTo(position(1, 0));
    }
}