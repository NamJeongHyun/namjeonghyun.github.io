package level1;

public class 다트게임 {

    public long[] solution(int x, int n){
        long[] answer = {};

        answer = new long[n];

        for(int i = 0; i < n ; i++){
            answer[i] = (x * (i+1));
        }
        return answer;
    }

    public static void main(String[] args) {
        다트게임 a = new 다트게임();


        System.out.println( a.solution(3,2));

    }
}
