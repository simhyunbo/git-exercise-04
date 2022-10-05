package CodeUp1005;

import java.util.Scanner;

public class CodeUp1019 {
    public static void main(String[] args) {
        String time;
        Scanner sc = new Scanner(System.in);
        time = sc.next();
        String[] timeArr = time.split("\\.");
        int a = Integer.valueOf(timeArr[0]);
        int b = Integer.valueOf(timeArr[1]);
        int c = Integer.valueOf(timeArr[2]);
        System.out.printf("%04d.%02d.%02d",a,b,c);


    }

}
