import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {

        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan"};
        String[] answer = solution(record);
        for (int i = 0; i<answer.length; i++){
            System.out.println(answer[i]);
        }

    }


    public static String[] solution(String[] record) {
        String[] answer = {};
        ArrayList<String[]> list = new ArrayList<>();
        HashMap<String, String> map = new HashMap<>();

        StringTokenizer st;
        for (int i = 0; i < record.length; i++) {
            st = new StringTokenizer(record[i]);

            String operation = st.nextToken();
            String uid = st.nextToken();
            if (st.hasMoreTokens()){ //enter, change
                String nickname = st.nextToken();
                map.put(uid,nickname);
            }
            if (!operation.equals("Change")) //enter, leave
                list.add(new String[]{operation, uid});
        }

        answer = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)[0].equals("Enter")){
                answer[i] = map.get(list.get(i)[1])+"님이 들어왔습니다.";
            }
            else answer[i] = map.get(list.get(i)[1])+"님이 나갔습니다.";
        }

        return answer;
    }
}

