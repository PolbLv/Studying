package Old;

import java.util.ArrayList;

public class ArrayListZeroToHundred1 {
    public static void main(String args[]) {
        ArrayList<Integer> myList = new ArrayList<>();
        int i = 0;
        for ( i = 0; i < 100; i++) {
            myList.add(i);
        }
        zeroToHundred(myList);
           //System.out.println(i);
        }

    public static void zeroToHundred(ArrayList<Integer> myList) {
        for (int i = 0; i < myList.size(); i++) {

           System.out.println((i));
        }
    }
}



/*СОздать список со значениями от 0 до 100.
 Создать метод выводящий все значения списка на экран.*/

/*перший обгортаєш у метод з return type ArrayList<Integer>
дргий приймає (ArrayList<Integer> list) і видруковує його*/


