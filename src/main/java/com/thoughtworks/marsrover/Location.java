package com.thoughtworks.marsrover;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

@AllArgsConstructor
@EqualsAndHashCode
public class Location {

  private Integer x;
  private Integer y;

  public void add(Location location) {
    this.x += location.x;
    this.y += location.y;
  }

  public String print() {
    return "(" + x + "," + y + ")";
  }
}
