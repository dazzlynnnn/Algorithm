import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String answer = solution(br.readLine());
        bw.write(answer);

        bw.flush();
        br.close();
        bw.close();
    }

    public static String solution(String s) {
        String answer = "";
        int len = s.length();
        if (len%2==0) answer = Character.toString(s.charAt(len/2-1)) + Character.toString(s.charAt(len/2));
        else answer = Character.toString(s.charAt(len/2));
        return answer;
    }
}