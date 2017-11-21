package duck.src.main.java;

public class MiniDuckSimulator {

  public static void main(final String[] args) {

    createNewMallardDuck();

    createNewModelDuck();

  }

  private static void createNewMallardDuck() {
    Duck mallard = new MallardDuck();
    mallard.display();
    mallard.performQuack();
    mallard.performFly();
  }

  private static void createNewModelDuck() {
    Duck modelDuck = new ModelDuck();

    modelDuck.performFly();

    modelDuck.display();

    // Change this duck's fly behavior on the fly!
    modelDuck.setFlyBehavior(new FlyRocketPowered());

    System.out.println("interface (behavior) should now be changed to FlyRocketPowered...");

    modelDuck.performFly();
  }
}
