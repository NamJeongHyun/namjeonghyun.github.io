package level1;

public class 완주하지못한선수 {

    /*
    * 문제 조건
    * 완주하지 못한 선수의 이름을 return 하도록 solution 함수 작성
    * completion길이는 paricipant 길이보다 1 작습니다.
    * 참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
    * 참가자 중에는 동명이인이 있을 수 있습니다.
    * */

    public String solution(String [] participant, String [] completion){
        String answer = "";

        for(int i = 0 ; i < participant.length ; i++){
            int a = 0;
            for(int j = 0 ; j < completion.length ; j++){
                while (j < completion.length) {
                    if (participant[i] != completion[j]) {
                        a++;
                        answer = participant[i];
                        if(a == completion.length){
                            return answer;
                        }
                        break;
                    } else {
                        answer = "All Completion !! Congratulations!!";
                        break;
                    }
                }
            }
        }
        return answer;
    }

    public String solution2(String [] participant, String [] completion){
        String answer = "";

        for(int i = 0 ; i < participant.length ; i++){
            int a = 0;
            for(int j = 0 ; j < completion.length ; j++){
                while (j < completion.length) {
                    if (participant[i] != completion[j]) {
                        a++;
                        answer = participant[i];
                        if(a == completion.length){
                            return answer;
                        }
                        break;
                    } else {
                        answer = "All Completion !! Congratulations!!";
                        break;
                    }
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        /*String [] participant = {"leo","kiki","eden"};
        String [] completion = {"eden","kiki"};*/

        /*String [] participant = {"a","b","c","d","e","f"};
        String [] completion = {"c","a","e","f"};*/

        String [] participant = {"marina","josipa","nikola","vinko","fillpa"};
        String [] completion = {"josipa","fillpa","marina","nikola"};

        완주하지못한선수 solution = new 완주하지못한선수();
        System.out.println(solution.solution(participant,completion)+"는 참여자 명단에는 있지만, 완주자 명단에는 없기떄문에 완주하지 못했습니다.");
        System.out.println(solution.solution2(participant,completion)+"는 참여자 명단에는 있지만, 완주자 명단에는 없기떄문에 완주하지 못했습니다.");
    }
}
