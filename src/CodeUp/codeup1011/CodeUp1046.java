package CodeUp.codeup1011;

import java.util.Scanner;

public class CodeUp1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum = a+b+c;
        float avg = (float) sum/3;
        System.out.println(sum);

        System.out.printf("%.1f", avg);



    }
}
