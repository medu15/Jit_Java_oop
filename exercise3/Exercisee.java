/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercisee;
public class Exercisee {
  public void animalSound() {
    System.out.println("The animal makes a sound");
  }


static class Pig extends Exercisee {
    @Override
  public void animalSound() {
    System.out.println("The pig says: wee wee");
  }
}

static class Dog extends Exercisee {
    @Override
  public void animalSound() {
    System.out.println("The dog says: bow wow");
  }
}
static class Main{
  public static void main(String[] args) {
    Exercisee myAnimal = new  Exercisee();  // Create a Animal object
    Exercisee myPig = new Pig();  // Create a Pig object
    Exercisee myDog = new Dog();  // Create a Dog object
    myAnimal.animalSound();
    myPig.animalSound();
    myDog.animalSound();
  }
}
}
  
