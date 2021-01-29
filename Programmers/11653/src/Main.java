import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int i = 2;
        while(n>1){
            if (n%i==0){
                bw.write(Integer.toString(i));
                bw.newLine();
                n/=i;
            }
            else i++;
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
