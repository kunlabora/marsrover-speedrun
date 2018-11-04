# MarsRover SpeedRun kata

This repository serves as an exercise example to implement parts of the MarsRover Kata as quickly as possible.

## How to use
* Clone this repository
* Open IntelliJ
* `File > Open > build.gradle`
* Select `Open as Project`

Then open a browser to open the exercise steps and follow them **in order**.

## Rules
Choose a _mode_ to SpeedRun the kata in: `Mouseless` or `Mouseful`.

The timer starts after you open the `RoverTest` file.

The timer ends when you've completed the last implementation and have all green tests.

### `Mouseless`
Once you've opened/imported the project into IntelliJ you're not allowed to use your mouse anymore.

Penalty seconds added for using a mouse = the duration of mouse usage * 2.

`Mouseless` allowed mouse usage:
* ctrl+selecting gradle builds (if you even need that) 

### `Mouseful`
You are not allowed to use shortcuts, only your mouse. You **can** use IntelliJ's refactor tools, but you'll have to access them via a (rightclicked) menu.

So no `refactor, rename`, `run tests`, or `multicursor using shortcuts`.

`Mouseful` allowed shortcuts:
* ctrl+c (Copy)
* ctrl+v (Paste)
* ctrl+space (Basic code completion)
* alt+enter (Show intention actions and quick-fixes)

Penalty seconds added for using a shortcut = 2 seconds per shortcut used.

_**Note**_  
Kickstarted with Java 8, AssertJ, JUnit and Mockito.

Happy Coding!
