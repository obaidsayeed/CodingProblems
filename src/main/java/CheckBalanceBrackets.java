//Given a string of round, curly, and square open and closing brackets, return whether the brackets are balanced (well-formed).
//
//For example, given the string "([])[]({})", you should return true.
//
//Given the string "([)]" or "((()", you should return false.
import java.util.Scanner;
import java.util.Stack;

public class CheckBalanceBrackets {
    public static boolean solution(String str){
        int n = str.length();
        Stack<Character> st = new Stack<>();
        for(int i = 0;i < n;i++){
            if(str.charAt(i) == '(' || str.charAt(i) == '[' || str.charAt(i) == '{'){
                st.push(str.charAt(i));
            }
            else if(str.charAt(i) == ')' && st.peek() == '('){
                st.pop();
            }
            else if(str.charAt(i) == ']' && st.peek() == '['){
                st.pop();
            }
            else if(str.charAt(i) == '}' && st.peek() == '{'){
                st.pop();
            }

        }
        if(st.size() != 0){
            return false;
        }
        return true;
    }
}
