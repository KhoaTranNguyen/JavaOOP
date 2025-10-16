public class StarTriangle {
    public static void main(String[] args) {
        int n = 10;
        int printLine = 0;
        
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                System.out.println("*");
            }
            else if (i == n) {
                for (int j = 1; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println("*");
            }
            else if ( i >= 2 ) {
                System.out.print("*");
                for (int j = 1; j <= i - 2; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        }


        for (int i = 1; i <= n*2; i++) {
            if (i == 1) {
                for (int j = 1; j < n; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
                printLine+=1;
            }
            else if (i == n*2) {
                for (int j = 1; j < n*2-1; j++) {
                    System.out.print("*");
                }
                System.out.println("*");
            }
            else {
                if (n+1-i > 1) {
                    for (int j = 1; j < n+1-i; j++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                    for (int j = 1; j <= printLine; j++) {
                        System.out.print(" ");
                    }
                    System.out.println("*");
                    printLine+=2;
                }
            }
        }    
    }
}