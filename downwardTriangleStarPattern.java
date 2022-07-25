package patternprograames;

import java.util.Scanner;

public class downwardTriangleStarPattern {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number of rows you want to print:- ");

        int rows = s.nextInt();

        for(int i = rows;i>=0;i--){

            for(int j = 0;j<=i;j++){

                System.out.print("*"+ " ");

            }

            System.out.println();
        }

    }

}
