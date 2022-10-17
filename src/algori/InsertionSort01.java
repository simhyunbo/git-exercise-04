package algori;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort01 {
    public int[] sort(int[] arr){

        //int swapNum = 0;
        for(int i = 1 ;i<arr.length;i++){
            for(int j = i; j>0;j--) {
                //System.out.printf("i:%d j:%d j-1:%d\n",i,j,j-1);
                if(arr[j] < arr[j-1]) {
                    int swapNum = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = swapNum;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        //5에서 출발을 합니다.
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        InsertionSort01 is = new InsertionSort01();
        int[] result = is.sort(arr);

        for(int i = 0 ;i<result.length;i++){
            System.out.println(result[i]);
        }
        //System.out.println(result.length);
        //System.out.println(Arrays.toString(result));

    }
}
