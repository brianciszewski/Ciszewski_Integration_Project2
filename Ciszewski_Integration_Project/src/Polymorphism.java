// Brian Ciszewski
// Example of polymorphism, the method 'sayName' means different things for for cat or mouse type. 
public class Polymorphism {

  public static void sayName() {
    System.out.print("Brian Ciszewski");
  }

  static class Cat extends Polymorphism {
    public static void sayName() {
      System.out.println("Tom");
    }
  }
  static class Mouse extends Polymorphism {
    public static void sayName() {
      System.out.println("Jerry");
    }
  }

}
