package Tasks_for_2017_03_27;

import java.util.ArrayList;

/**
 * Created by LVIVSOFT\spolyakov on 05.04.17.
 */
public class PopulateListRandomDigitsWithSimpleIndexes {
    public static void main(String args[]) {

        ArrayList<Integer> myList = populateList(5, 10);
        System.out.println(myList);
        for (int i = 0; i < myList.size(); i++) {
            if (isSimple(i)) {
                System.out.println(myList.get(i));
            }
        }
    }
    public static ArrayList<Integer> populateList(int size, int limit) {
        ArrayList<Integer> myList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            myList.add((int) (Math.random() * (limit + 1)));
        }
        return myList;
    }
    public static boolean isSimple(int num) {
        if (num == 0) {
            return false;
        }
        for (int x = 2; x < num; x++) {
            if (num % x == 0) {
                return false;
            }
        }
        return true;
    }
}
/* Используя метод populateList создать список случайных чисел от 0 до 500,
вывести на экран числа из списка у которых индексы в списке являются простым числом*/