package MapExercise;

public class AlphabetCnt {
    public boolean isAlphabet(char c){
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
        String s1 = "aabbccddeeffakkkrrml";
        for(int i =0;i<s1.length();i++){
            System.out.println(s1.charAt(i));
        }

        char ch1 = 'a';
        char ch2 = '1';
        System.out.println(alphabetCnt.isAlphabet(ch1));
        System.out.println(alphabetCnt.isAlphabet(ch2));


    }
}
