package Chapter4.StaticByName;

class StaticDemo {
  static int a = 42; // a = 42;
  static int b = 99; // b = 99;

  static void callme() {
    System.out.println(a);
  }
}

public class StaticByName {
  public static void main(String[] args) {
    StaticDemo.callme(); // a = 42; don't need to create any obj
    System.out.println(StaticDemo.b); // b = 99;
  }
}
