package generic;

public class GenericClass<K, V> {

    private K key;
    private V value;

    public GenericClass(K key, V value){
        this.key = key;
        this.value = value;
    }

    public K getKey(){
        return key;
    }

    public V getValue(){
        return value;
    }

    public static void main(String[] args) {
        GenericClass<String, Integer> genericClass = new GenericClass<>("apple",5000);

        /*
            AutoBoxing이란?
            기초 자료형을 대응되는 클래스 객체로 자동으로 변환해주는 기능
            int => Integer
        */

        System.out.println("genericClass.getKey():" + genericClass.getKey());
        System.out.println("genericClass.getValue():" + genericClass.getValue());
    }
}
