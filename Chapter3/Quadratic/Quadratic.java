package Chapter3.Quadratic;

import java.util.*;

public class Quadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Solve ax^2 + bx + c = 0");

        System.out.print("Input a: ");
        double a = Double.valueOf(sc.nextLine());

        System.out.print("Input b: ");
        double b = Double.valueOf(sc.nextLine());

        System.out.print("Input c: ");
        double c = Double.valueOf(sc.nextLine());

        double eps = 1e-12;

        int aZero = (Math.abs(a) < eps) ? 0 : 1;
        int bZero = (Math.abs(b) < eps) ? 0 : 1;
        int cZero = (Math.abs(c) < eps) ? 0 : 1;

        switch (aZero) {
            case 0:
                switch (bZero) {
                    case 0:
                        switch (cZero) {
                            case 0:
                                System.out.println("x belongs to R");
                                break;
                            default:
                                System.out.println("No results since a=b=0, c≠0");
                                break;
                        }
                        break;
                    default:
                        switch (cZero) {
                            case 0:
                                System.out.println("x = 0");
                                break;
                            default:
                                System.out.println("x = " + (-c/b));
                                break;
                        }
                        break;
                }
                break;
            default:
                switch (bZero) {
                    case 0:
                        switch (cZero) {
                            case 0:
                                System.out.println("x = 0");
                                break;
                            default:
                                if (a*c > 0) {
                                    System.out.println("No resutls since a*c > 0");
                                }
                                else if (a*c < 0) {
                                    System.out.println("x = " + Math.sqrt((double)(-c/a)));
                                }
                                break;
                        }
                        break;
                    default:
                        switch (cZero) {
                            case 0:
                                if (a*b > 0) {
                                    System.out.println("No resutls since a*b > 0");
                                }
                                else if (a*b < 0) {
                                    System.out.println("x = " + Math.sqrt((double)(-b/a)));
                                }
                                break;
                            default:
                                double delta = b*b - 4*a*c;
                                if (delta > 0) {
                                    System.out.println("x1 = " + ((-b + Math.sqrt(delta))/(2*a)));
                                    System.out.println("x2 = " + ((-b - Math.sqrt(delta))/(2*a)));
                                }
                                else if (delta == 0) {
                                    System.out.println("x1 = x2 = " + (-b/(2*a)));
                                }
                                else if (delta < 0) {
                                    System.out.println("No results since delta < 0");
                                }
                                break;
                        }
                        break;
                }
        }

        sc.close();
    }
}
