import java.util.*;

public class SCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Give the diameter: ");
        double d = Double.valueOf(sc.nextLine());

        System.out.printf("Area: %.2f%n", Math.pow(d/2, 2)*Math.PI);
        System.out.printf("Circumference: %.2f%n", d*Math.PI);

        sc.close();
    }
}

/*
    PS D:\Visual Studio Code\JavaOOP> cd SCircle
    PS D:\Visual Studio Code\JavaOOP\SCircle> javac SCircle.java
    PS D:\Visual Studio Code\JavaOOP\SCircle> java SCircle
    Give the diameter: 5
    Area: 19.63
    Circumference: 15.71
    PS D:\Visual Studio Code\JavaOOP\SCircle> 
 */