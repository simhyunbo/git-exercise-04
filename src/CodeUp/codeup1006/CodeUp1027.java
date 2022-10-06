package CodeUp.codeup1006;

import java.util.Scanner;

public class CodeUp1027 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] date = str.split("\\.");

        System.out.println(date[2]+"-"+date[1]+"-"+date[0]);
        }

}
