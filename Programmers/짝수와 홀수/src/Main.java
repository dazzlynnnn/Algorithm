import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(solution(s.nextInt()));
    }

    public static String solution(int num) {
        String answer = "";
        if (num%2==0) answer = "Even";
        else answer = "Odd";
        return answer;
    }
}
