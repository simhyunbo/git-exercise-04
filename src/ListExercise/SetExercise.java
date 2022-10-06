package ListExercise;

import java.util.HashSet;
import java.util.Set;

public class SetExercise {
    public static void main(String[] args) {
        //set은 중복을 허용하지 않는다  ex)랜덤으로 숫자 0부터 100까지 넣을때 set을 이용한다
        //중복 검사를 할때 set에 집어넣는 방법도 있다.
        //실습2-set random number 50개를 생성하고 중복이 되지 않는 숫자만 남기는 것
        Set<String> set1 = new HashSet<>(); //tree set
        set1.add("김경록");
        set1.add("김경록");

        System.out.println(set1);

    }
}
