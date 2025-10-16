import java.util.Scanner;

public class LightSpeed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Give number of days: ");
        int lightspeed = 18600;
        int days = Integer.valueOf(sc.nextLine());

        System.out.print("Number of miles that light will travel in " + days + " day(s): ");
        System.out.println(lightspeed*days*24*3600);
        sc.close();
    }
}

/*
    PS D:\Visual Studio Code\JavaOOP> cd LightSpeed
    PS D:\Visual Studio Code\JavaOOP\LightSpeed> javac LightSpeed.java
    PS D:\Visual Studio Code\JavaOOP\LightSpeed> java LightSpeed
    Give number of days: 50
    Number of miles that light will travel in 50 day(s): -1252378624
 */