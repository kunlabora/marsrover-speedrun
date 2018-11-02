package be.swsb.coderetreat;

import org.junit.jupiter.api.Test;

import java.net.NoRouteToHostException;

import static be.swsb.coderetreat.Direction.*;
import static be.swsb.coderetreat.Direction.NORTH;
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
        assertThat(rover().getDirection()).isEqualTo(NORTH);
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
    void forwards_RoverFacingEast_MovesUpTheXAxis() {
        final Rover rover = rover(EAST);
        rover.forward();

        assertThat(rover.getPosition()).isEqualTo(position(1, 0));
    }

    @Test
    void forwards_RoverFacingSouth_MovesDownTheYAxis() {
        final Rover rover = rover(SOUTH);
        rover.forward();

        assertThat(rover.getPosition()).isEqualTo(position(0, -1));
    }

    @Test
    void forwards_RoverFacingWest_MovesDownTheXAxis() {
        final Rover rover = rover(WEST);
        rover.forward();

        assertThat(rover.getPosition()).isEqualTo(position(-1, 0));
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
    void backwards_RoverFacingEast_MovesDownTheXAxis() {
        final Rover rover = rover(EAST);
        rover.backward();

        assertThat(rover.getPosition()).isEqualTo(position(-1, 0));
    }

    @Test
    void backwards_RoverFacingSouth_MovesUpTheYAxis() {
        final Rover rover = rover(SOUTH);
        rover.backward();

        assertThat(rover.getPosition()).isEqualTo(position(0, 1));
    }

    @Test
    void backwards_RoverFacingWest_MovesUpTheXAxis() {
        final Rover rover = rover(WEST);
        rover.backward();

        assertThat(rover.getPosition()).isEqualTo(position(1, 0));
    }

    @Test
    void left_RoverRotatesCounterClockwise() {
        final Rover rover = rover();
        assertThat(rover.getDirection()).isEqualTo(NORTH);
        assertThat(rover.getPosition()).isEqualTo(position(0,0));
        rover.left();
        assertThat(rover.getDirection()).isEqualTo(WEST);
        assertThat(rover.getPosition()).isEqualTo(position(0,0));
        rover.left();
        assertThat(rover.getDirection()).isEqualTo(SOUTH);
        assertThat(rover.getPosition()).isEqualTo(position(0,0));
        rover.left();
        assertThat(rover.getDirection()).isEqualTo(EAST);
        assertThat(rover.getPosition()).isEqualTo(position(0,0));
        rover.left();
        assertThat(rover.getDirection()).isEqualTo(NORTH);
        assertThat(rover.getPosition()).isEqualTo(position(0,0));
    }
}