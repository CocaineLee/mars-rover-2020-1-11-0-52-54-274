package com.thoughtworks.marsrover;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MarsCar {

  private Location location;
  private Direction.Forward forward;

  public void receiveMission(String mission) {
    for (int i = 0; i < mission.length(); i++) {
      char c = mission.charAt(i);
      if (c == 'M') {
        if (forward.equals(Direction.Forward.E)) {
          this.location.moveYForward();
        }
      } else if (c == 'L') {
        this.forward = Direction.turnLeft(forward);
      }else if (c == 'R') {
        this.forward = Direction.turnRight(forward);
      }

    }
  }
}
