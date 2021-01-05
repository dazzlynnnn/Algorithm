import java.util.*;
public class Main {
    public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);

	    int a = s.nextInt();
	    int[] N = new int[a];
	    for (int i=0; i<a; i++){
	        N[i] = s.nextInt();
        }
        Arrays.sort(N);

	    int b = s.nextInt();
	    int[] M = new int[b];
	    for (int i=0; i<b; i++) {
            M[i] = s.nextInt();
            int ex = Arrays.binarySearch(N, M[i]);
            if (ex<0) System.out.print("0 ");
            else System.out.print("1 ");
        }

    }
}
