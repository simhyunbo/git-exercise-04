package collection;

import java.util.ArrayList;
import java.util.List;

public class LikeLion2th {
    private List<String> students = new ArrayList<>();
    Names likelionName = new Names();
    public LikeLion2th(){
        this.students = likelionName.getNames();
    }
    // 멋사 2기 학생의 이름이 들어있는 list를 return하는 method
    public List<String> getStudentList(){
        return this.students;
    }
}
