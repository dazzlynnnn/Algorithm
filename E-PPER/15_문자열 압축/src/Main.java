import java.io.*;
//프로그래머스에서는 main함수 및 입출력문이 필요하지 않습니다. 대신 solution함수만 작성하면 됩니다.
public class Main {
    static String solution(String input){
        StringBuilder sb = new StringBuilder();
        if (input.charAt(0)=='1'){
            sb.append('1');
        }
        char c = 'A';
        for (int i=0; i<input.length()-1; i++){
            if (input.charAt(i+1)==input.charAt(i)){
                c++;
            }
            else{
                sb.append(c);
                c = 'A';
            }
        }
        sb.append(c);
        String answer = sb.toString();
        return answer;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        String answer= solution(input);
        System.out.println(answer);
    }
}