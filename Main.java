
package zee;

  
interface car {
  void getName(String name);
}

class toyota implements car {

  public void getName(String name) {
    System.out.println("the car is: " + name);
  }
}

class Main {
  public static void main(String[] args) {
    toyota car = new toyota();
    car.getName("toyota");
  }
}

 
