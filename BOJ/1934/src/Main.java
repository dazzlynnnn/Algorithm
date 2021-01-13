import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int x, y, lcm;
        for (int i=0; i<n; i++){
            x = s.nextInt();
            y = s.nextInt();
            lcm = x*y/gcd(x, y);
            System.out.println(lcm);
        }
    }

    public static int gcd(int x, int y){
        if (y==0) return x;
        else return gcd(y, x%y);
    }
}
