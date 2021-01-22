import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int i = Integer.parseInt(br.readLine());
        if (i>=90) System.out.println("A");
        else if (i>=80) System.out.println("B");
        else if (i>=70) System.out.println("C");
        else if (i>=60) System.out.println("D");
        else System.out.println("F");

        br.close();
    }
}