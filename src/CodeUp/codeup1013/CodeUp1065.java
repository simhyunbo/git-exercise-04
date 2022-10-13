package CodeUp.codeup1013;

import java.util.Scanner;

public class CodeUp1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int [] arr = {a,b,c};

        for(int i=0;i<3;i++){
            if(arr[i]%2==0){
                System.out.println(arr[i]);
            }
        }

    }
}
