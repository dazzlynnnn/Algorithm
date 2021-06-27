import java.util.*;
public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {1,3,2,5,4};
        System.out.println(s.solution(arr, 9));
    }
}

class Solution {
    public int solution(int[] d, int budget) {
        int i = 0;
        Arrays.sort(d);
        while(i<d.length){
            budget-=d[i];
            if (budget>=0) i++;
            else break;
        }
        return i;
    }
}