package CodeUp.codeup1011;

import java.util.Scanner;

public class CodeUp2081 {

    public int getMax(int[] arr) {
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        } return max;
    }
        public int getCnt(int[] arr,int max){
            int cnt = 0;
            for (int i = 0; i < arr.length; i++) {
                if (max == arr[i]) {
                    cnt = i + 1;
                }
            }return cnt;
        }

    public static void main(String[] args) {
        CodeUp2081 code = new CodeUp2081();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b=  sc.nextInt();
        int c=  sc.nextInt();
        int d=  sc.nextInt();
        int e=  sc.nextInt();
        int f=  sc.nextInt();
        int g=  sc.nextInt();
        int h=  sc.nextInt();
        int j=  sc.nextInt();


        int[] arr = {a, b, c, d, e, f, g, h, j };

        int max = code.getMax(arr);
        int cnt = code.getCnt(arr,max);

        System.out.println(max);
        System.out.println(cnt);


    }
}
