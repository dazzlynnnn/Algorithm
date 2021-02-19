import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int max = 0;
        int index = 0;
        int num = 0;

        for (int i=0; i<9; i++){
            num = s.nextInt();
            if(max < num) {
                max = num; index = i+1;
            }
        }
        System.out.println(max);
        System.out.println(index);

    }
}
