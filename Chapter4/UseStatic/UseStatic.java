// package Chapter4.UseStatic;

public class UseStatic {
  public int a = 100;
  static int b = 1;

  static {
    System.out.println("How can b exist here?");
    System.out.println("Static: b = " + b);
    b = 100; // this will use static, not create local
    System.out.println("Static: b = " + b); // b = 100
    int b = 1000; // but this will also accept
    System.out.println("Static: b = " + b); // b = 1000
  }

  static void meth() {
    System.out.println("Meth: b = " + b);
    int b = 999;
    System.out.println("Meth: b = " + b); // b = 999
  }

  public static void main(String[] agrs) {
    System.out.println("Main: b = " + b);
    meth();

    UseStatic ob1 = new UseStatic();
    UseStatic ob2 = new UseStatic();
    ob2.b = 77;
    ob2.a = 99;
    System.out.println(ob1.a + " " + ob2.a);
    System.out.println(UseStatic.b);
  }
}//
