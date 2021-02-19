import java.util.*;
public class Main {

    public static void main(String[] args) {
	    int m = 1;
	    int[] num = new int[10];
        Scanner sc = new Scanner(System.in);

        for (int i=0; i<3; i++){
            m *= sc.nextInt();
        }

        do {
            num[m%10]++;
            m/=10;
        } while(m>0);

        for (int i=0; i<10; i++){
            System.out.println(num[i]);
        }
    }
}
