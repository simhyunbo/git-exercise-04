package CodeUp.codeup1006;

import java.util.Scanner;

public class CodeUp1025 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int mil = num/10000;
        int thu = num%10000/1000;
        int hun = num%1000/100;
        int ten = num%100/10;
        int one = num%10;
        int[] numArr = {mil*10000,thu*1000,hun*100,ten*10,one};
        for(int i =0;i<numArr.length;i++){
            System.out.println("["+numArr[i]+"]");
        }

    }
}
