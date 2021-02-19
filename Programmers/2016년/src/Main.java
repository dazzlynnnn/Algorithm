public class Main {

    public static void main(String[] args) {
	    System.out.println(solution(5,24));
    }
    public static String solution(int a, int b){
        String answer = "";

        int cnt=0; // 1월 1일은 cnt = 1 (첫번째 날)
        int[] calendar = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] days = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        for (int i=0; i<a-1; i++){
            cnt+=calendar[i];
        }
        cnt+=b;
        answer = days[cnt%7];
        return answer;
    }
}

