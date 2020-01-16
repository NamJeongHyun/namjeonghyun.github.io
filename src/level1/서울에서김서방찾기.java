package level1;

import java.util.Arrays;

public class 서울에서김서방찾기 {

    public String solution(String [] seoul){
        String answer = "";

        if(0 < seoul.length && seoul.length <= 1000) {
            for (int i = 0; i < seoul.length; i++) {
                if(0 < seoul[i].length() && seoul[i].length() <= 20) {
                    if (seoul[i].equals("Kim")) {
                        answer = "김서방은 " + i + "에 있다";
                    }
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String seoul[] = {"Jane","Kim"};
        서울에서김서방찾기 a = new 서울에서김서방찾기();
        System.out.println(a.solution(seoul));

        System.out.println(Arrays.asList(seoul).indexOf("Jane"));
        System.out.println(Arrays.asList(seoul).contains("Jane"));
    }
}
