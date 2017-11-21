package duck.src.main.java;

public class MallardDuck extends Duck {

  public MallardDuck() {

    // This duck can quack
    this.quackBehavior = new Quack();

    // This duck can fly with wings
    this.flyBehavior = new FlyWithWings();
  }

  @Override
  public void display() {
    System.out.println("I'm a mallard duck!");
  }
}
