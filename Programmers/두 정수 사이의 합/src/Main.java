import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        bw.write(Long.toString(solution(a, b)));
        bw.flush();
        br.close();
        bw.close();
    }

    public static long solution(int a, int b) {
        long answer = 0;
        if (a>b){
            int tmp=a;
            a=b; b=tmp;
        }
        for (int i=a; i<=b; i++) answer+=i;
        return answer;
    }
}
