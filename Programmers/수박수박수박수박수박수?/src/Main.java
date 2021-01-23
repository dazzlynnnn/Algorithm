import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        bw.write(solution(n));

        bw.flush();
        br.close();
        bw.close();
    }

    public static String solution(int n) {
        StringBuilder answer = new StringBuilder();
        for (int i=0; i<n; i++){
            if(i%2==0) answer.append("수");
            else answer.append("박");
        }
        return answer.toString();
    }
}
