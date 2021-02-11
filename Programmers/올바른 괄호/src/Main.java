import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(solution(s));
    }

    static boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();


        for (int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if (c=='(') stack.push(c);
            else{
                if (stack.empty()) answer = false;
                else stack.pop();
            }
        }
        if (!stack.empty()) answer = false;
        return answer;
    }
}
