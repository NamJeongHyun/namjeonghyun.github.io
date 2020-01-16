package recursivefunction;

public class Recursive {
    public static void main(String[] args) {
        String [] phone_book = {"12","1234","3412"};

        //1234에 12가 포함되어 있는가?
        int index = phone_book[1].indexOf(phone_book[0]);
        System.out.println(index);

        System.err.println("---------------------------------");

        for(int i = 0 ; i < 2 ; i++){
            for(int j = i+1; j < 3 ; j++){
                System.out.println(i+"="+j);
                System.out.println(j+"="+i);
                System.out.println("---------------------------------");
            }
        }
    }
}
