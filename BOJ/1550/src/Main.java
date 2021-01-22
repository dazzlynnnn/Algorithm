import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int len = s.length();
        int bin = 0;
        if(s.equals("0") && len == 1) System.out.println(0);
        else {
            for(int i = len-1; i >= 0; i--){
                bin += (change(s.charAt(i)) * Math.pow(16, len-i-1));
            }
        }
        System.out.println(bin);
        br.close();
    }
    public static int change(char a){
        int result;
        switch(a){
            case 'A': result=10; break;
            case 'B': result=11; break;
            case 'C': result=12; break;
            case 'D': result=13; break;
            case 'E': result=14; break;
            case 'F': result=15; break;
            default: result = a-'0';
        }
        return result;
    }
}
