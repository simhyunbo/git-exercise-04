package algori;

import java.util.Scanner;

public class RightTriangle {
    public static void main(String[] args) {
        /*
        * i=0 별이 1개
        ** i=1 별이 2개
        *** i=2 별이 3개
        **** i=3 별이 4개
         */
        Scanner sc = new Scanner(System.in);
        int starNum = sc.nextInt();
        for(int i =0;i<starNum;i++){
            for(int j =0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
