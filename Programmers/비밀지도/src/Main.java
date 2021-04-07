public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};

        String[] answer = s.solution(5, arr1, arr2);
        for (int i=0; i<5; i++){
            System.out.println(answer[i]);
        }
    }
}

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for (int i=0; i<n; i++){
            answer[i] = "";
        }
        String[] str1 = new String[n];
        String[] str2 = new String[n];
        for (int i=0; i<n; i++){
            str1[i] = Integer.toBinaryString(arr1[i]);
            while(str1[i].length()<n){
                str1[i] = "0" + str1[i];
            }
            str2[i] = Integer.toBinaryString(arr2[i]);
            while(str2[i].length()<n) {
                str2[i] = "0" + str2[i];
            }
        }
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++) {
                if (str1[i].charAt(j)=='1' || str2[i].charAt(j)=='1')
                    answer[i] = answer[i] + "#";
                else
                    answer[i] = answer[i] + " ";
            }
        }

        return answer;
    }
}