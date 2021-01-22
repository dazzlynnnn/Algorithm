import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        if (m<45){
            if (h==0) h=24;
            h-=1;
            m+=60;
        }
        bw.write(Integer.toString(h)+" "+Integer.toString(m-45));
        bw.flush();
        bw.close();
        br.close();
    }
}