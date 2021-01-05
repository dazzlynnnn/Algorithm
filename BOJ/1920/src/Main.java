import java.util.*;
public class Main {
    public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
        boolean ex;

	    int a = s.nextInt();
	    int[] N = new int[a];
	    for (int i=0; i<a; i++){
	        N[i] = s.nextInt();
        }

	    int b = s.nextInt();
	    int[] M = new int[b];
	    for (int i=0; i<b; i++) {
	        ex = false;
            M[i] = s.nextInt();

            for (int j=0; j<a; j++){
                if (N[j]==M[i]){
                    ex = true;
                    break;
                }
            }

            if (ex) System.out.print("1 ");
            else System.out.print("0 ");
        }
    }
}
