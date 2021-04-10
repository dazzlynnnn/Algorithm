import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    Solution s = new Solution();
	    int[] array = {1,5,2,6,3,7,4};
	    int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
	    System.out.println(s.solution(array, commands)[0]);
    }
}


class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i=0; i< commands.length; i++){
            int[] temp = new int[array.length];
            for (int j=commands[i][0]-1; j<commands[i][1]-1; j++){
                temp[i] = array[j];
            }
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2]-1];
        }
        return answer;
    }
}