package com.thoughtworks.marsrover;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

@AllArgsConstructor
@EqualsAndHashCode
public class Location {

  private Integer x;
  private Integer y;

  public void moveXForward() {
    this.x++;
  }


  public void moveYForward() {
    this.y++;
  }
}
