package algori.programmers;

public class numSum {
    public long solution(int a, int b) {
        long answer = 0;
        int num = 0;
        if(a>b){
            num = a;
            a = b;
            b = num;
        }
        for(int i = a ; i<=b;i++){
            answer +=i;
        }

        return answer;
    }

    public static void main(String[] args) {
        numSum sumnum = new numSum();
        sumnum.solution(3 , 5);
        System.out.println(sumnum.solution(3,5));
    }
}
