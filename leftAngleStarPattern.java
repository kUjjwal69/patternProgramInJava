import java.util.Scanner;

public class leftAnglePatternStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines of stars you want to print:- ");
        int lines = sc.nextInt();
        for(int i = 0;i<=lines;i++){
            for(int spaces = 2*(lines-i);spaces>=0;spaces--){
                System.out.print(" ");

            }
            for(int j = 0;j<=i;j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
