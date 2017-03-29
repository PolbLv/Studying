import java.util.ArrayList;


/**
 * Created by Serhiy on 3/28/17.
 */
public class ArrayListZeroToHundred {
    static ArrayList<Integer> myList = new ArrayList<>(100);

    public static void main(String args[]) {

        arrayListZeroTHundred();
        //myMethod();

    }


    public static void arrayListZeroTHundred() {

        for (int i = 0; i <= 100; i++) {
            myList.add(i);
        }

        for (int j = 1; j <= myList.size(); j++) {
            System.out.println((myList.get(j)));
        }
    }
}

//СОздать список со значениями от 0 до 100.
// Создать метод выводящий все значения списка на экран.
/*public static void myMethod() {
    int initialSize = 100;
    ArrayList<Integer> numbers = new ArrayList<Integer>(initialSize);
    for (int i = 0; i < initialSize; i++)

    {
        numbers.add(i);
        System.out.println(numbers.get(i));
    }
}
}*/