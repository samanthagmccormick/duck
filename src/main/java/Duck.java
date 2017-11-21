package duck.src.main.java;

public abstract class Duck {

  FlyBehavior flyBehavior;
  QuackBehavior quackBehavior;

  public Duck() {

  }

  public abstract void display();

  public void performFly() {
    this.flyBehavior.fly();
  }

  public void performQuack() {
    this.quackBehavior.quack();
  }

  public void swim() {
    System.out.println("All ducks float, even decoys!");
  }

  // Dynamically set the behaviors for an object on the fly!
  public void setFlyBehavior(FlyBehavior fb) {
    this.flyBehavior = fb;
  }

  public void setQuackBehavior(QuackBehavior qb) {
    this.quackBehavior = qb;
  }

}
