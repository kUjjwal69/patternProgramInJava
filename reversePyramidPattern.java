import java.util.Scanner;

public class reversePyramidPattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines you want to print:- ");
        int lines = sc.nextInt();
        for(int i = 0;i<=lines-1;i++){
            for(int spaces = 0;spaces<=i;spaces++){
                System.out.print(" ");

            }
            for(int j = 0;j<lines-i;j++){
                System.out.print("*" + " " );

            }
            System.out.println();
        }

    }
}
