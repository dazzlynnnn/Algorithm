import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        int after = 0;

        for (int i=1; i<x; i++){
            if(i==2)
                after+=28;
            else if (i==4||i==6||i==9||i==11)
                after+=30;
            else after+=31;
        }
        after += y-1;

        switch (after%7){
            case 0: System.out.println("MON"); break;
            case 1: System.out.println("TUE"); break;
            case 2: System.out.println("WED"); break;
            case 3: System.out.println("THU"); break;
            case 4: System.out.println("FRI"); break;
            case 5: System.out.println("SAT"); break;
            default: System.out.println("SUN");
        }
        s.close();
    }
}
