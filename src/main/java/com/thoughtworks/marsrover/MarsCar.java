package com.thoughtworks.marsrover;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MarsCar {

  private Location location;
  private Direction direction;

  public void receiveMission(String mission) {
    for (int i = 0; i < mission.length(); i++) {
      if (mission.charAt(i) == 'M') {
        if (direction.equals(Direction.E)) {
          this.location.moveYForward();
        }
      }
    }
  }
}
