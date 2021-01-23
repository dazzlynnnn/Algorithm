import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[st.countTokens()];
        int j=0;
        while(st.hasMoreTokens())
            arr[j++] = Integer.parseInt(st.nextToken());

        int[] answer = solution(arr);
        for (int i=0; i<answer.length; i++)
            bw.write(Integer.toString(answer[i])+" ");

        bw.flush();
        br.close();
        bw.close();
    }

    public static int[] solution(int []arr) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(arr[0]);
        for(int i=1; i<arr.length; i++) {
            if(arr[i]!=arr[i-1]) {
                list.add(arr[i]);
            }
        }

        int[] answer = new int[list.size()];
        for (int i=0; i<answer.length; i++) {
            answer[i] = list.get(i).intValue();
        }
        return answer;
    }
}
