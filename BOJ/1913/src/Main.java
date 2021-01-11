import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException, NoSuchElementException {
        Scanner s = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = s.nextInt();
        int find = s.nextInt();
        int[][] arr = new int[n][n];

        int a = n / 2, b = n / 2;
        int level = 1;
        int num = 1;
        int x = 0, y = 0;

        while (true) {
            for (int i = 0; i < level; i++) {
                arr[a][b] = num++;
                a--;
            }
            if ((num - 1) == n * n) break;
            for (int i = 0; i < level; i++) {
                arr[a][b] = num++;
                b++;
            }
            level++;
            for (int i = 0; i < level; i++) {
                arr[a][b] = num++;
                a++;
            }
            for (int i = 0; i < level; i++) {
                arr[a][b] = num++;
                b--;
            }
            level++;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                bw.write(arr[i][j] + " ");
                if (find == arr[i][j]) {
                    x = i + 1;
                    y = j + 1;
                }
            }
            bw.newLine();
        }
        bw.write(x + " " + y);
        bw.flush();

    }
}
