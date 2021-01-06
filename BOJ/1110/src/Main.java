import java.util.*;
public class Main {
    public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    int n = s.nextInt();
	    int a = n/10;
	    int b = n%10;
	    int c;
	    int newnum = -1;
	    int count = 0;
	    while(n!=newnum){
	        c = a+b;
			a = b;
	        b = c%10;
	        newnum = a*10+b;
	        count++;
        }
	    System.out.println(count);
    }
}
