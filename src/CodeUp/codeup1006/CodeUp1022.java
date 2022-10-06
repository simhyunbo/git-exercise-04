package CodeUp.codeup1006;

import java.util.Scanner;

public class CodeUp1022 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] date = new char[str.length()];
        for(int i =0;i<str.length();i++){
            date[i] = str.charAt(i);
        }
        System.out.println(date);


    }
}
