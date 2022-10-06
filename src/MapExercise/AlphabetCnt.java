package MapExercise;

import java.util.HashMap;

public class AlphabetCnt {
    //2.true false 반환
    public boolean isAlphabet(char c){
        //(c>='A' && c<='Z') || (c>='a' && c<='z')도 가능하다.
        if((c>=65 && c<=90) || (c>=97 && c<=122)){
            return true;
        }else {
            return false;
        }

    }
    public static void main(String[] args) {
        AlphabetCnt alphabetCnt = new AlphabetCnt();
        //1.String 한글자씩 출력할 수 있어야 한다.
        //charAt(인덱스)
        String s1 = "aabb///ccdd:eeffak://kkrr.ml".toUpperCase();

        //
        HashMap<Character,Integer> alphabetMap = new HashMap<>();
        for(char c = 'A';c<'Z';c++){
            alphabetMap.put(c,0);
        }

        for(int i =0;i<s1.length();i++){
            char c = s1.charAt(i);
            boolean isAlphabet = alphabetCnt.isAlphabet(c);
            if(isAlphabet){
                //여기에서만 개수를 센다
                alphabetMap.put(c,alphabetMap.get(c)+1);
            }
        }
        System.out.println(alphabetMap);






    }
}
