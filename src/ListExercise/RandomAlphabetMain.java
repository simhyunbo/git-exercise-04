package ListExercise;

import java.util.HashSet;
import java.util.Set;

public class RandomAlphabetMain {
    public static void main(String[] args) {
        AlphabetGenerator alphabetGenerator;
        

        RandomAlphabet randomAlphabet = new RandomAlphabet();
        Set<Character> setAlphabet = new HashSet<>();

        for(int i=0;i<100;i++){
            setAlphabet.add((char)randomAlphabet.generateAlpha());

        }
        System.out.println(setAlphabet);
    }
}
