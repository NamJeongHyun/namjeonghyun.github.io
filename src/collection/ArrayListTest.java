package collection;

/*
* ArrayList 란?
* 요소들의 인덱스를 사용하는 것은 배열과 유사하지만 배열과 다르게 저장되는 데이터의 개수의 따라 자동적으로 크기가 변경되고,
* 요소가 가득차게 되며 크기를 동적으로 증가시킨다. 반대로 요소가 삭제되면 그만큼 크기를 줄익 된다.
* add(), set(), remove(), next(), hasNext()*/

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Nam");
        list.add("Jeong");
        list.add("Hyun");

        int index = list.indexOf("Jeong");

        if(index == 2){
            for(int i = 0; i < list.size(); i++){
                System.out.println(list.get(i));
            }
        }else{
            System.out.println("인덱스가 잘못 됬어");
        }

        Iterator e = list.iterator();
        String s;

        while (e.hasNext()){
            //hasNext 아직 방문하지 않은 원소가 있으면 true를 반환

            s = (String)e.next(); // 반복자는 object 타입을 반환(형변환 필수)
            System.out.println(s);
        }

        System.out.println("===============================test start===================================>");

        ArrayList<Object> ex = new ArrayList<>();
        ex.add("1");
        ex.add("2");
        ex.add("3");
        ex.add("4");

        ex.add(1,"원래 1자리 뺏은 1");

        System.out.println("확인해보자 : " + ex.get(1));
        System.out.println("확인해보자 : " + ex.get(2));

        for(Object sad : ex){
            System.out.println(sad);
        }
    }
}
