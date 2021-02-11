public class Main {

    public static void main(String[] args) {

        String[] seoul = {"Kim", "Lee", "Park"};
        System.out.println(solution(seoul));
    }

    public static String solution(String[] seoul) {
        String answer = "";
        int i;
        for (i=0; i<seoul.length; i++){
            if (seoul[i].equals("Kim")) break;
        }
        answer = "김서방은 "+i+"에 있다";
        return answer;
    }
}
