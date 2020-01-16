package com.thoughtworks.marsrover;

import java.util.Arrays;
import java.util.List;
import lombok.Setter;

@Setter
public class Direction {

  private Forward forward;
  private static final List<Forward> FORWARDS = Arrays
      .asList(Forward.N, Forward.E, Forward.S, Forward.W);

  public static Forward turnLeft(Forward old) {
    int nextIndex = (FORWARDS.indexOf(old) + FORWARDS.size() - 1) % FORWARDS.size();
    return FORWARDS.get(nextIndex);
  }

  public static Forward turnRight(Forward old) {
    int nextIndex = (FORWARDS.indexOf(old) + 1) % FORWARDS.size();
    return FORWARDS.get(nextIndex);
  }

  public enum Forward {
    E,
    W,
    N,
    S
  }
}
