import java.util.ArrayList;

public class ArrayListZeroToHundred1 {
    static ArrayList<Integer> myList = new ArrayList<>(100);

    public static void main(String args[]) {

        arrayListZeroTHundred();
    }


    public static void arrayListZeroTHundred() {

        for (int i = 0; i <= 100; i++) {
            myList.add(i);
        }

        for (int j = 1; j <= myList.size() - 1; j++) {
            System.out.println((myList.get(j)));
        }
    }
}

/*СОздать список со значениями от 0 до 100.
 Создать метод выводящий все значения списка на экран.*/





