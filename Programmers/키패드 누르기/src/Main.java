public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.println(s.solution(numbers, "right"));
    }
}

class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int ld, rd;
        int[][] coor = {{0,0},{-1,3},{0,3},{1,3},{-1,2},{0,2},{1,2},{-1,1},{0,1},{1,1},{-1,0},{1,0}};
        int[] loc = {10, 11};
        for (int i=0; i<numbers.length; i++){
            if (coor[numbers[i]][0]==-1){
                loc[0] = numbers[i];
                answer = answer + "L";
            }
            else if (coor[numbers[i]][0]==1){
                loc[1] = numbers[i];
                answer = answer + "R";
            }
            else {
                ld = Math.abs(coor[loc[0]][0]-coor[numbers[i]][0]) + Math.abs(coor[loc[0]][1]-coor[numbers[i]][1]);
                rd = Math.abs(coor[loc[1]][0]-coor[numbers[i]][0]) + Math.abs(coor[loc[1]][1]-coor[numbers[i]][1]);
                if ( ((ld==rd) && hand.equals("left")) || ld<rd){
                    loc[0] = numbers[i];
                    answer = answer + "L";
                }
                else{
                    loc[1] = numbers[i];
                    answer = answer + "R";
                }
            }
        }
        return answer;
    }
}