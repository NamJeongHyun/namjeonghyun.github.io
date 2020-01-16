package generic;

public class GenericMethod {

    public static <T> void printArray(T[] array) {

        for (int i = 0; i < array.length; i++) {

            if (i != array.length - 1) {
                System.out.print(array[i] + ",");
            } else {
                System.out.print(array[i]);
            }
        }
        System.out.println();
    }

    /*public static <T>  T test(T[] array){
        T largest = array[0];
        System.out.print(largest);
        return largest;
    }*/

    public static void main(String[] args) {
        Integer[] iArray = {10, 20, 30, 40, 50};
        Double[] dArray = {1.1, 1.2, 1.3, 1.4, 1.5};
        Character[] cArray = {'a', 'b', 'c', 'd', 'e'};

        String s = "3";
        System.out.println(Integer.valueOf(s));
        System.out.println("cArray[0].compareTo('a') : " + cArray[0].compareTo('a'));
        //true 일 경우 0 반환 false 경우 -1 반환

        printArray(iArray);
        printArray(dArray);
        printArray(cArray);
    }
}
