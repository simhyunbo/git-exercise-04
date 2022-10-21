package algori.programmers;

import java.util.Stack;

public class SolveBracket {
    public boolean solution1(String s){
        while (s.indexOf("()")>=0){
            s = s.replace("()","");
        }
        return s.length() == 0;
    }

    public boolean solution(String s){
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if('(' == s.charAt(i)){
                st.push(s.charAt(i));
            } else if ((')' ==s.charAt(i))) {
                st.pop();
            }
        }
        return st.empty();
    }

}
