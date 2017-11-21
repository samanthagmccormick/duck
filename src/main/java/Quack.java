package duck.src.main.java;

public class Quack implements QuackBehavior {
  @Override
  public void quack() {
    System.out.println("Quack!");
  }
}
