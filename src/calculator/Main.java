package calculator;

public class Main {
    public static void main(String[] args) {
        NumberGenerator numberGenerator = new RandomNumberGenerator();
        Calculator randomNumberCalculator = new Calculator(numberGenerator);
        randomNumberCalculator.plus();

        NumberGenerator specificGenerator = new SpecificNumberGenerator();
        Calculator specificNumberCalculator = new Calculator(specificGenerator);
        specificNumberCalculator.plus();

    }
}
