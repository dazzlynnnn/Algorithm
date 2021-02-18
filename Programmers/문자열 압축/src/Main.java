public class Main {

    public static void main(String[] args) {

        System.out.println(solution("xxxxxxxxxxyyy"));
    }

    public static int solution(String s){
        int answer = s.length();

        int len; // 각 단위마다 압축한 결과 길이
        String str1; String str2; // 비교할 문자열
        int start1; int start2; // 문자열 자를 인덱
        boolean rpt; // 반복 스위치
        int cnt; // 반복 횟수

        for (int i=1; i<=(s.length()/2); i++){
            len = s.length();
            start1 = 0; start2 = i; // substring 시작 위치
            rpt = false; cnt = 0; // 각 변수 초기화

            while((start2+i) <= s.length()) {
                str1 = s.substring(start1, start1+i);
                str2 = s.substring(start2, start2+i);
                if (str1.equals(str2)){
                    if (!rpt) { //첫 반복
                        cnt++; // 첫 반복
                        rpt = true; // 반복 스위치 on
                    }
                    len -= i; // 압축
                    cnt++; // 반복 횟수 증가
                }
                else {
                    if (rpt){ // 반복이 끝난 직후에만 len 변화; 반복되지 않으면 len 압축 없음
                        len += count_digit(cnt); // xxxxxxxxxx -> 10x처럼 앞에 붙는 숫자 자릿수 만큼 길이 증가
                        rpt = false; cnt = 0; // 변수 다시 초기화
                    }
                }
                start1+=i; start2+=i; // 뒤로 i칸 옮기기
            } // end of while

            if (rpt) { // 마지막까지 비교했는데 반복 스위치 on 된 상태로 끝났을 때 마지막 털기
                len += count_digit(cnt);
            }
            if (answer > len) answer = len; // 압축한 문자열 길이 최소값으로 갱신
        } // end of for
        return answer;
    }

    static int count_digit(int i){ // 자릿수 세기
        int digit = 0;
        do {
            i = i/10;
            digit++;
        } while(i>0);
        return digit;
    }
}
