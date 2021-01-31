import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());
        for (int i=1; i<=t; i++) {
            st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            String b = st.nextToken();
            int aa = Integer.parseInt(a);
            int bb = Integer.parseInt(b);
            bw.write("Case #"+Integer.toString(i)+": ");
            bw.write(a+" + "+b+" = "+Integer.toString(aa+bb)+"\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}