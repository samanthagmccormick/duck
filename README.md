# Design Patterns Chapter 1: The Duck Simulator Program (Strategy Pattern)

This repo is the exercise from Chapter 1 of [Head First Design Patterns](https://www.amazon.com/Head-First-Design-Patterns-Brain-Friendly/dp/0596007124).

## How to run

- git clone this repo
- cd ..
- compile the java files: `javac duck/src/main/java/*.java`
- run the java main program: `java duck/src/main/java/MiniDuckSimulator`

## Lessons from Chapter 1

### Identify the aspects of your application that vary, and separate them from what stays the same.

All ducks have some shared properties. But some ducks can fly and some (like wood ducks) cannot, and some ducks can quack and some cannot (like mute ducks).

We know that fly() and quack() are parts of the Duck class.

To separate these behaviors from the Duck class, pull these methods out of the Duck class and create a new set of classes to represent each behavior.

### Why?

It allows you to not have to write repetitive code across the application. You could have one 
giant 
Duck class that uses `fly()` and `quack()` but that will mean that for non-flying ducks you will
 have to override those methods and leave them blank which results in a lot of repetitive and 
 dead code everywhere.
 
It allows for less drastic changes across the application. If you modify or add a new behavior to
 the Duck class, you will have to edit wherever the Duck class was used across the app which 
 results in many new changes / possibility of new bugs.
 
It allows us to dynamically change the behavior of a duck during runtime.

### Notes from Chapter 1 exercise

- Behaviors: Fly, Quack
- These behaviors can become interfaces because they are the variable qualities as explained above.
- Fly interface will have a `fly()` method.
- Quack interface will have a `quack()` method.

The **Duck** class becomes an abstract class, and declares 2 reference variables, `quackBehavior` 
and `flyBehavior`. The Duck abstract also delegates fly and quack behavior using these  
variables ex) `performFly() { flyBehavior.fly(); }`


We can **implement the interfaces** like so:
- new class `FlyWithWings implements FlyBehavior`. We define the 
fly() method there as as can-fly bird.
- new class `FlyNoWay implements FlyBehavior`. We define the fly method as a nope-can't-fly bird.
- new class `Quack implements QuackBehavior`. We define the quack method to make a quack sound.
- new class `MuteQuack implemets QuackBehavior`. We define the quack method to make NO quack sound.
- etc...

Any new ducks you create will **extend** the Duck class
- Define a new class `MallardDuck extends Duck`
- in the constructor, declare a `quackBehavior` and `flyBehavior` using those interfaces.
- Define a `display()` method that lets people know this is a mallard duck (required by the `Duck` 
class contract)

Create a test class to test everything out:
- Create a new class `MiniDuckSimulator` with a `main` method
- Create a new intance of `MallardDuck`
- Call `mallardDuck.performQuack()` and `mallardDuck.performFly()`
- This ^ calls the MallardDuck's inherited performQuack method, which then delegates to 
`QuackBehavior.quack()`

Dynamic Behavior 

- It also allows us to dynamically switch an object's interfaces on the fly. See 
`MiniDuckSimulator.createNewModelDuck()`


