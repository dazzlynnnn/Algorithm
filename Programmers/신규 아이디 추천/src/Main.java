import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(solution("=.="));
    }

    public static String solution(String new_id) {
        String answer = "";
        char c; int i;
        ArrayList <Character> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        // <1단계>
        new_id = new_id.toLowerCase();

        // <2단계>
        for (i=0; i<new_id.length(); i++){
            c = new_id.charAt(i);
            if (('a'<=c && c<='z') || ('0'<=c && c<='9') || c=='-' || c=='_' || c=='.'){
                list.add(c);
            }
        }

        // <3단계>
        i=1;
        while(i<list.size()){
            if (list.get(i)=='.' && list.get(i-1)=='.'){
                list.remove(i);
            }
            else i++;
        }

        // <4단계>
        if (list.get(0)=='.') list.remove(0);
        if (!list.isEmpty()){
            if (list.get(list.size()-1)=='.') list.remove(list.size()-1);
        } 

        // 여기에서부터는 길이에 따라 단계가 달라짐
        Iterator<Character> it = list.iterator();
        if (list.isEmpty()){ // <5단계>
            return "aaa";
        }
        else if (list.size()==1){ // <7단계>
            return list.get(0).toString()+list.get(0).toString()+list.get(0).toString();
        }
        else if (list.size()==2){ // <7단계>
            return list.get(0).toString()+list.get(1).toString()+list.get(1).toString();
        }
        else if (list.size()<=15) {
            while (it.hasNext()) sb.append(it.next());
        }
        else if (list.get(14)=='.'){ // <6단계인데 마지막 문자가 '.' 인 경우
            for(i=0; i<14; i++) sb.append(it.next());
        }
        else { // <6단계>
            for(i=0; i<15; i++) sb.append(it.next());
        }
        answer = sb.toString();
        return answer;
    }
}
