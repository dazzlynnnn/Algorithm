public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        int a = s.solution("1234");
        System.out.println(a);
    }
}


class Solution {
    public int solution(String s) {
        return Integer.parseInt(s);
    }
}