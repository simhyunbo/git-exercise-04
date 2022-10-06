package CodeUp.codeup1006;

import java.util.Scanner;

public class CodeUp1024 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] divstr = str.split("");
        for(int i =0;i<str.length();i++){
            System.out.println("'"+divstr[i]+"'");
        }


    }
}
