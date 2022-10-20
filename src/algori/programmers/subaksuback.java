package algori.programmers;

public class subaksuback {
    public String solution(int n) {
        String answer = "";

        for (int i = 1; i <= n; i++) {
            if(i%2==0){
                answer +="박";
            }else {
                answer +="수";
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        subaksuback subak = new subaksuback();
        subak.solution(3);
        System.out.println(subak.solution(3));
    }
}
