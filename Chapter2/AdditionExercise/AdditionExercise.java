import java.util.Scanner;

public class AdditionExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.print("Input the second number: ");
        int second = Integer.valueOf(scanner.nextLine());
        System.out.print("Input the third number: ");
        int third = Integer.valueOf(scanner.nextLine());

        System.out.println("first + second + third = " + (first + second + third));
        scanner.close();
    }
}
