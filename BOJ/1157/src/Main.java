import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int arr[] = new int[26];
        String s = br.readLine();
        int len = s.length();
        for(int i = 0; i < len; i++){
            char c = s.charAt(i);
            if (c<91) arr[c-65]++; //대문자인 경우
            else arr[c-97]++; //소문자인 경우
        }

        int max=0;
        int maxi=0;
        for(int i = 0; i < 26; i++){
            if (max<arr[i]){
                max = arr[i];
                maxi = i;
            }
            else if (max==arr[i]){
                maxi = -1;
            }
        }
        if (maxi==-1) bw.write("?");
        else bw.write((char)maxi+65);
        bw.flush();
        br.close();
        bw.close();
    }
}