package com.thoughtworks.marsrover;

import java.util.Arrays;
import java.util.List;
import lombok.EqualsAndHashCode;
import lombok.Setter;

@Setter
@EqualsAndHashCode
public class Direction {

  private Forward forward;
  private static final List<Forward> FORWARDS = Arrays
      .asList(Forward.N, Forward.E, Forward.S, Forward.W);

  public Direction(Forward forward) {
    this.forward = forward;
  }

  public void turnLeft() {
    int nextIndex = (FORWARDS.indexOf(forward) + FORWARDS.size() - 1) % FORWARDS.size();
    this.forward = FORWARDS.get(nextIndex);
  }

  public void turnRight() {
    int nextIndex = (FORWARDS.indexOf(forward) + 1) % FORWARDS.size();
    this.forward = FORWARDS.get(nextIndex);
  }

  public Location step() {
    switch (forward) {
      case E:
        return new Location(1, 0);
      case W:
        return new Location(-1, 0);
      case N:
        return new Location(0, 1);
      default:
        return new Location(0, -1);
    }
  }

  public String print() {
    return this.forward.name();
  }

  public enum Forward {
    E,
    W,
    N,
    S
  }
}
