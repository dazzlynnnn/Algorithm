import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    Solution s = new Solution();
	    int[] array = {1,5,2,6,3,7,4};
	    int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
	    System.out.println(s.solution(array, commands)[0]);
        System.out.println(s.solution(array, commands)[1]);
        System.out.println(s.solution(array, commands)[2]);
    }
}

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i=0; i< commands.length; i++){
            int[] temp = new int[commands[i][1]-commands[i][0]+1];
            for (int j=0; j<temp.length; j++){
                temp[j] = array[j+commands[i][0]-1];
            }
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2]-1];
        }
        return answer;
    }
}