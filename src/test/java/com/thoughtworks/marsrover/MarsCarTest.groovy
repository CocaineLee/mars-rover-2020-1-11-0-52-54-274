package com.thoughtworks.marsrover

class MarsCarTest extends spock.lang.Specification {
  def marsCar = new MarsCar()

  def 'car can move one step forward'() {
    given:
      marsCar.setLocation(new Location(1,1))
      marsCar.setDirection(Direction.E)
    when:
      marsCar.receiveMission("M")
    then:
      marsCar.getLocation() == new Location(1,2)
      marsCar.getDirection() == Direction.E
  }

}
