//rightAnglePatternInJava

import java.util.Scanner;

public class rightAnglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines you want to print:- ");
        int lines = sc.nextInt();

        for(int i = 0;i<=lines;i++){
            for(int j = 0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
