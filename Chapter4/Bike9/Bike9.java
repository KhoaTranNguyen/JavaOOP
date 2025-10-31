package Chapter4.Bike9;

public class Bike9 {
  final int speedlimit = 90;

  void run() {
    speedlimit = 400; // not accept
  }

  public static void main(String[] args) {
    Bike9 ob = new Bike9();
    ob.run();
  }
}
