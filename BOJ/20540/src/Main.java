import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String mbti = br.readLine();
        if (mbti.charAt(0)=='I') bw.write('E');
        else bw.write('I');
        if (mbti.charAt(1)=='S') bw.write('N');
        else bw.write('S');
        if (mbti.charAt(2)=='F') bw.write('T');
        else bw.write('F');
        if (mbti.charAt(3)=='J') bw.write('P');
        else bw.write('J');

        bw.flush();
        bw.close();
        br.close();
    }
}
