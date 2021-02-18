import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        System.out.println(solution("()))((()"));
    }

    public static String solution(String p){
        String answer = "";
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        int i = 0;
        char c;

        // <1단계>
        if (p.isEmpty()) return "";

        // <2단계>
        c = p.charAt(i++);
        stack.push(c);
        if (c=='('){
            while(!stack.isEmpty()){
                c = p.charAt(i++);
                if (c==')') stack.pop();
                else stack.push(c);
            }
        }
        else {
            while(!stack.isEmpty()){
                c = p.charAt(i++);
                if (c=='(') stack.pop();
                else stack.push(c);
            }
        }
        String u = p.substring(0,i);
        String v = p.substring(i);

        // <3단계>
        if (correct(u)){
            sb.append(u);
            sb.append(solution(v)); // <3-1>
        }
        // <4단계>
        else {
            sb.append('('); // <4-1>
            sb.append(solution(v)); // <4-2>
            sb.append(')'); // <4-3>
            for (int j=1; j<u.length()-1; j++){ // <4-4>
                if (u.charAt(j)=='(') sb.append(')');
                else sb.append('(');
            }
        }
        answer = sb.toString();
        return answer; // <4-5>
    }

    public static Boolean correct(String u){ // 올바른 괄호 문자열인지 검사하는 메소드
        Stack<Character> stack = new Stack<>();
        for (int i=0; i<u.length(); i++){
            char c = u.charAt(i);
            if (c=='(') stack.push(c);
            else{
                if (stack.empty()) return false;
                else stack.pop();
            }
        }
        return true;
    }
}
