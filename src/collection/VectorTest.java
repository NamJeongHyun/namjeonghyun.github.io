package collection;

import java.util.Vector;

/*
* Vector 이란?
* 1. 가변크기 배열이다.
* 2. 요소의 개수가 늘어나면 자동으로 배열의 크기가 늘어난다.
* 3. 어떤 타입의 객체라도 저장할 수 있다.
* 4. 값 추가는 add(), 값 추출은 get()
* 5. get()은 object 타입으로 반환하기 때문에 개별적으로 값을 추출할때는 형변환이 필요하다.
* */

public class VectorTest {
    public static void main(String[] args) {
        Vector vc = new Vector();
        vc.add("jdbc");
        vc.add(1995);

        for(int i = 0; i < vc.size(); i++){
            System.out.println("VectorValue : " + vc.get(i));
        }
    }
}
