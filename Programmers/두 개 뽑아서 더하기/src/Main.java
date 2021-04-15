import java.util.*;
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] numbers = {2,1,3,4,1};
        int[] answer = s.solution(numbers);
        for (int i=0; i<answer.length; i++){
            System.out.println(answer[i]);
        }
    }
}

class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> sum = new ArrayList<>();
        for (int i=0; i<numbers.length-1; i++){
            for (int j=i+1; j<numbers.length; j++){
                if (!sum.contains(numbers[i]+numbers[j]))
                    sum.add(numbers[i]+numbers[j]);
            }
        }
        int[] answer = sum.stream().mapToInt(i->i).toArray();
        Arrays.sort(answer);
        return answer;
    }
}