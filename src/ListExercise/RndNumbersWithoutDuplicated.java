package ListExercise;

import calculator.NumberGenerator;
import calculator.RandomNumberGenerator;

import java.util.HashSet;
import java.util.Set;

public class RndNumbersWithoutDuplicated {
    public static void main(String[] args) {

        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        Set<Integer> setNum = new HashSet<>();

        for(int i=0;i<50;i++){
           setNum.add(randomNumberGenerator.generate(20));
           System.out.println(setNum);
        }
        System.out.println(setNum.size());
    }
}
