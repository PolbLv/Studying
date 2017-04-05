package Tasks_for_2017_03_27;

import java.util.ArrayList;

/**
 * Created by LVIVSOFT\spolyakov on 31.03.17.
 */
public class PopulateListCountDigitsInTheList {
    public static void main(String args[]) {

        ArrayList<Integer> myList = populateList(25, 500);
            int counter = 0;
            for (int i = 0; i < myList.size(); i++) {
            int el = myList.get(i);
            if (el % 2 == 0) {
                counter++;
                //System.out.println((el));
            }
        }
        System.out.println("Counter = " + counter);

    }

    public static ArrayList<Integer> populateList(int size, int limit) {
        ArrayList<Integer> myList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            myList.add((int) (Math.random() * (limit + 1)));
        }
        return myList;
    }
}
/*Используя метод populateList создать список случайных чисел от 0 до 500,
вывести на экран количество четных чисел в списке*/