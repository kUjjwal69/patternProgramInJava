package patternprograames;

import java.util.Scanner;

public class diamondPattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of rows you want to print:- ");
        int rows = s.nextInt();
        // for  upper portion first
        int mid = (rows+1)/2;
        for(int i = 1;i<=mid;i++){
            for(int spaces =  1;spaces<=mid-i;spaces++){
                System.out.print(" ");
            }
            for(int j = 1;j<=(2*i)-1;j++){
                System.out.print("*");

            }
            System.out.println();
        }
        // now for  lower part

        for(int i = 1;i<=mid-1;i++){
            for(int spaces = 1;spaces<=i;spaces++){
                System.out.print(" ");
            }
            for(int j = 1;j<=(mid-i)*2-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
