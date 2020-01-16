package com.thoughtworks.marsrover

class MarsCarTest extends spock.lang.Specification {
  def marsCar = new MarsCar()

  def 'car can move one step forward when forward E'() {
    given:
      marsCar.setLocation(new Location(1,1))
      marsCar.setForward(Direction.Forward.E)
    when:
      marsCar.receiveMission("M")
    then:
      marsCar.getLocation() == new Location(1,2)
      marsCar.getForward() == Direction.Forward.E
  }

  def 'car can turn left to N when forward E'() {
    given:
      marsCar.setLocation(new Location(1,1))
      marsCar.setForward(Direction.Forward.E)
    when:
      marsCar.receiveMission("L")
    then:
      marsCar.getLocation() == new Location(1,1)
      marsCar.getForward() == Direction.Forward.N
  }

  def 'car can turn right to S when forward E'() {
    given:
      marsCar.setLocation(new Location(1,1))
      marsCar.setForward(Direction.Forward.E)
    when:
      marsCar.receiveMission("R")
    then:
      marsCar.getLocation() == new Location(1,1)
      marsCar.getForward() == Direction.Forward.S
  }



}
