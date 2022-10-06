package MapExercise;

import java.util.HashMap;

public class MapExercise2 {
    public static void main(String[] args) {
        //String s에 있는 a~z까지 알파벳의 개수를 세는 알고리즘을 구현 해보세요.
        //대소문자는 구별하지 않습니다.
        //hint

        String repoAddr = "ASDAS";
        HashMap<String, Integer> alphabetCnt = new HashMap<>();

        for(int i = 65;i<=90;i++){
            int count = 0;
            char alphabet = (char)i;
            for(int j =0;j<repoAddr.length();j++){
                if(alphabet == repoAddr.charAt(j)){
                    count++;
                }
                alphabetCnt.put(String.valueOf(alphabet),count);
            }

        }
        System.out.println(alphabetCnt.get("A")+"개입니다.");



    }
}
