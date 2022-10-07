package CodeUp.codeup1007;

import java.util.Scanner;

public class CodeUp1035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();

        //16진수를 10진수로 바꾸는 방법
        int num10 =Integer.valueOf(num,16);
        String num8 = Integer.toOctalString(num10);
        System.out.println(num8);




    }
}
