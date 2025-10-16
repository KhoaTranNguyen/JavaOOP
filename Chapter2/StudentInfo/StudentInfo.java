import java.util.*;

public class StudentInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("- Full name: ");
        String name = sc.nextLine();

        System.out.print("- Major: ");
        String major = sc.nextLine();

        System.out.print("- Intake: ");
        String intake = sc.nextLine();
        
        System.out.print("- Year: ");
        String year = sc.nextLine();

        System.out.printf("- Full name: %s%n", name);
        System.out.printf("- Major: %s%n", major);
        System.out.printf("- Intake: %s%n", intake);
        System.out.printf("- Year: %s%n", year);

        sc.close();
    }
}

/*
    PS D:\Visual Studio Code\JavaOOP\StudentInfo> javac StudentInfo.java
    PS D:\Visual Studio Code\JavaOOP\StudentInfo> java StudentInfo      
    - Full name: Alice
    - Major: CSE
    - Intake: 2023
    - Year: 3
    - Full name: Alice
    - Major: CSE
    - Intake: 2023
    - Year: 3
    PS D:\Visual Studio Code\JavaOOP\StudentInfo> 
 */