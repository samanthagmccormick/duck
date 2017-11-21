# Design Patterns Chapter 1: The Duck Simulator Program

This repo is the exercise from Chapter 1 of [Head First Design Patterns](https://www.amazon.com/Head-First-Design-Patterns-Brain-Friendly/dp/0596007124).

## Lessons from Chapter 1

### Separate what changes from what stays the same.

All ducks have some shared properties. But some ducks can fly and some (like wood ducks) cannot, and some ducks can quack and some cannot (like mute ducks).

We know that fly() and quack() are parts of the Duck class.

To separate these behaviors from the Duck class, pull these methods out of the Duck class and create a new set of classes to represent each behavior.