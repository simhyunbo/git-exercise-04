package CodeUp.codeup1006;

import java.util.Scanner;

public class CodeUp1023 {
    public static void main(String[] args) {

        //String형태로 변환 후 다시 Integer로 타입 변환
        Scanner sc = new Scanner(System.in);


        String str = sc.next();
        String[] divstr = str.split("\\.");
        int num1 = Integer.parseInt(divstr[0]);
        int num2 = Integer.parseInt(divstr[1]);
        System.out.println(num1);
        System.out.println(num2);

        


    }
}
