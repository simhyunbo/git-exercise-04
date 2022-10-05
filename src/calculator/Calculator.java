package calculator;

public class Calculator {
    //NumberCreator
    NumberGenerator NumberGenerator;

    public Calculator(NumberGenerator numberGenerator) {
        this.NumberGenerator = numberGenerator;
    }


    public void plus(){

        System.out.println(10+ NumberGenerator.generate(10));
    }

}
