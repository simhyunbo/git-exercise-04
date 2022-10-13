package CodeUp.codeup1013;

import java.util.Scanner;

public class CodeUp1064 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.printf("%d",(a<b ? a:b)<c ? (a<b ? a:b):c);
        //삼항연산자 a>b ? a:b 참:거짓
        

    }
}
