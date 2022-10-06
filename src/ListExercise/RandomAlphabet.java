package ListExercise;

public class RandomAlphabet implements AlphabetGenerator{


    @Override
    public int generateAlpha() {
        return 65+(int) (Math.random()*26);
    }
}
