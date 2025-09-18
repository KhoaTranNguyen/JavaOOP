package LightSpeed;
import java.util.Scanner;

public class LightSpeed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Give number of days:");
        int lightspeed = 18600;
        int days = Integer.valueOf(sc.nextLine());

        System.out.println("Number of miles that light will travel in " + days + " day(s):");
        System.out.println(lightspeed*days*24*3600);
        sc.close();
    }
}
