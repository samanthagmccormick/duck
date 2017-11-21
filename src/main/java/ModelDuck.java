package duck.src.main.java;

public class ModelDuck extends Duck{

  public ModelDuck() {

    // This duck cannot fly
    this.flyBehavior = new FlyNoWay();
    this.quackBehavior = new Quack();
  }

  @Override
  public void display() {
    System.out.println("I'm a model duck!");
  }
}
