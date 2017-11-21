package duck.src.main.java;

public class FlyNoWay implements FlyBehavior {

  @Override
  public void fly() {
    System.out.println("I can't flyyyyyy!");
  }

}
