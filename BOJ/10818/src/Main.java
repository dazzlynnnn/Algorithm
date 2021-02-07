import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int arr[] = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int max = arr[0];
        int min = arr[0];

        for (int i=1; i<n; i++){
            if (max < arr[i]) max = arr[i];
            if (min > arr[i]) min = arr[i];
        }
        bw.write(Integer.toString(min)+" "+Integer.toString(max));
        bw.flush();
        br.close();
        bw.close();
    }

}