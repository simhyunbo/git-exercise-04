package algori.programmers;

import java.util.Arrays;

public class kthsolTest {
    public int[] solution(int[] arr, int[][] commands) {
        int[] answer = new int[commands.length];
        int idx = 0;
        for (int[] command :commands) {
            int[] slicedArr = Arrays.copyOfRange(arr, command[0]-1, command[1]); // array를 slice합니다.
            Arrays.sort(slicedArr); // 정렬을 합니다.
            answer[idx++] = slicedArr[command[2]-1]; // 정렬한 Array의 idx번째를 뽑습니다.
        }
        return answer;
    }

    public static void main(String[] args) {
        kthsolTest kthsolTest = new kthsolTest();
        int[] arr = {1,5,2,6,3,7,4};
        int[][] com = {{2,5,3},{4,4,1},{1,7,3}};
        kthsolTest.solution(arr,com);

        System.out.println(Arrays.toString( kthsolTest.solution(arr,com)));

    }
}
