package level1;

import java.util.Arrays;

public class 시저암호 {

    public String solution(String s, int n){
        String [] english = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","S","Y","Z"};
        String [] english2 = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","s","y","z"};
        String answer = "";
        int count = 0;
        char [] s_arr = s.toCharArray();
        String [] n_arr = new String[s.length()];
        //{"A","B"}
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s_arr.length ; i++){
            if(s_arr[i] == ' ') {

            }else{
                if(Character.isUpperCase((s_arr[i]))) {
                    if(s_arr[i] == 'Z'){
                        count = Arrays.asList(english).indexOf(String.valueOf(s_arr[i])) - 26;
                        n_arr[i] = english[count + n];
                    }else {
                        count = Arrays.asList(english).indexOf(String.valueOf(s_arr[i]));
                        n_arr[i] = english[count + n];
                    }
                }else{
                    if(s_arr[i] == 'z'){
                        count = Arrays.asList(english2).indexOf(String.valueOf(s_arr[i])) - 26;
                        n_arr[i] = english2[count + n];
                    }else {
                        count = Arrays.asList(english2).indexOf(String.valueOf(s_arr[i]));
                        n_arr[i] = english2[count + n];
                    }
                }
            }
        }
        for(int k = 0; k < n_arr.length ; k++){
            sb.append(n_arr[k]);
        }
        answer = String.valueOf(sb);
        return answer;
    }

    public static void main(String[] args) {
        String s = "kjhBHJb hh ";
        int n = 3;

        시저암호 a = new 시저암호();
        System.out.println(a.solution(s,n));
    }
}
