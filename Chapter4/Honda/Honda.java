package Chapter4.Honda;

final class Bike {
  final void run() {
    System.out.println("running");
  }
}

public class Honda extends Bike {
  void run() {
    System.out.println("running safely");
  }

  public static void main(String[] args) {
    Honda honda = new Honda();
    honda.run();
  }
}