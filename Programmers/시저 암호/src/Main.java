import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        int n = Integer.parseInt(br.readLine());

        bw.write(solution(s, n));
        bw.flush();
        bw.close();
        br.close();
    }

    public static String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if (65<=c && c<=90){
                c = (char) (((c+n)-65)%26+65);
                sb.append(c);
            }
            else if (97<=c && c<=122){
                c = (char) (((c+n)-97)%26+97);
                sb.append(c);
            }
            else sb.append(' ');
        }
        String answer = sb.toString();
        return answer;
    }
}