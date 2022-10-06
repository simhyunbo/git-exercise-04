package CodeUp.codeup1006;

import java.util.Scanner;

public class CodeUp1026 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] time = str.split(":");
        System.out.println(Integer.parseInt(time[1]));
        }

}
