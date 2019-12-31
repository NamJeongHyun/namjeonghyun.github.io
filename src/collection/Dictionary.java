package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dictionary {

    public static void main(String[] args) {
        HashMap<String,String> hashMap = new HashMap<>();

        hashMap.put("map","지도");
        hashMap.put("school","학교");

        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("영어 단어를 입력해주세요 : ");
            String key = sc.next();

            if(key.equals("quit")) break;
            System.out.println("단어의 의미는 " + hashMap.get(key));
        }while (true);
    }
}
