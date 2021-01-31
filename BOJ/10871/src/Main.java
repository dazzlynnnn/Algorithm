import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        for (int i=0; i<n; i++){
            int a = sc.nextInt();
            if (x>a) System.out.print(a+" ");
        }
    }
}