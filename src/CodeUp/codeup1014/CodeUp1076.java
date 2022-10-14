package CodeUp.codeup1014;

import java.util.Scanner;

public class CodeUp1076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char ch = str.charAt(0);

        for(int i = 97;i<=Integer.valueOf(ch);i++){
            System.out.print((char)(i)+" ");
        }

        }
    }

