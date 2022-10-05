public class RandomCalculator {
    int randomNum = (int)(Math.random()*9);
    int num;
    public RandomCalculator(int num){
        this.num = num;
    }
    public void plus(){
        System.out.println(num+randomNum);
    }

    public void min(){
        System.out.println(num-randomNum);
    }

    public void mul(){
        System.out.println(num*randomNum);
    }

    public void div(){
        try {
            System.out.println(num/randomNum);
        }catch (ArithmeticException e){
            System.out.println("랜덤하게 생성된 숫자가 0입니다.");
        }

    }

}
