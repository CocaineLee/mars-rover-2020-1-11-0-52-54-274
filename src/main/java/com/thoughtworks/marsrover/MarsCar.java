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
      char c = mission.charAt(i);
      move(c);
    }

    System.out.println("my location :" + this.location.print() + "\n"
        + "my direction :" + this.direction.print());
  }

  private void move(char c) {
    switch (c) {
      case 'L':
        this.direction.turnLeft();
        break;
      case 'R':
        this.direction.turnRight();
        break;
      case 'M':
        this.location.add(direction.step());
        break;
      default:
        System.out.println("sorry i dont know what is it" + c);
    }
  }
}


