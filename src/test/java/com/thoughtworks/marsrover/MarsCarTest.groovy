package com.thoughtworks.marsrover

class MarsCarTest extends spock.lang.Specification {
  def marsCar = new MarsCar()

  def 'car can move one step forward when forward E'() {
    given:
      marsCar.setLocation(new Location(1, 1))
      marsCar.setDirection(new Direction(Direction.Forward.E))
    when:
      marsCar.receiveMission("M")
    then:
      marsCar.getLocation() == new Location(2, 1)
      marsCar.getDirection() == new Direction(Direction.Forward.E)
  }

  def 'car can move one step forward when forward W'() {
    given:
      marsCar.setLocation(new Location(1, 1))
      marsCar.setDirection(new Direction(Direction.Forward.W))
    when:
      marsCar.receiveMission("M")
    then:
      marsCar.getLocation() == new Location(0, 1)
      marsCar.getDirection() == new Direction(Direction.Forward.W)
  }


  def 'car can turn left to N when forward E'() {
    given:
      marsCar.setLocation(new Location(1, 1))
      marsCar.setDirection(new Direction(Direction.Forward.E))
    when:
      marsCar.receiveMission("L")
    then:
      marsCar.getLocation() == new Location(1, 1)
      marsCar.getDirection() == new Direction(Direction.Forward.N)
  }

  def 'car can turn right to S when forward E'() {
    given:
      marsCar.setLocation(new Location(1, 1))
      marsCar.setDirection(new Direction(Direction.Forward.E))
    when:
      marsCar.receiveMission("R")
    then:
      marsCar.getLocation() == new Location(1, 1)
      marsCar.getDirection() == new Direction(Direction.Forward.S)
  }

  def 'car can turn to S,and move to (2,3) when forward E from(1,1)'() {
    given:
      marsCar.setLocation(new Location(1, 1))
      marsCar.setDirection(new Direction(Direction.Forward.E))
    when:
      marsCar.receiveMission("RRRRLLLLMLMMLL")
    then:
      marsCar.getLocation() == new Location(2, 3)
      marsCar.getDirection() == new Direction(Direction.Forward.S)
  }



}
