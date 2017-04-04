package Tasks_for_2017_03_27;

import java.util.ArrayList;

/**
 * Created by LVIVSOFT\spolyakov on 31.03.17.
 */
public class PopulateListCountDigitsInTheList {
    public static void main(String args[]) {

        ArrayList<Integer> myList = populateList();

        for (int i = 0; i < myList.size(); i++) {
            int el = myList.get(i);
            if (el % 2 == 0) {
                System.out.println((el));
            }
        }
    }

    public static ArrayList<Integer> populateList() {
        ArrayList<Integer> myList = new ArrayList<>();
        for (int i = 0; i < 13; i++) {
            myList.add((int) (Math.random() * (500 + 1)));
        }
        return myList;
    }
}
/*Используя метод populateList создать список случайных чисел от 0 до 500,
вывести на экран количество четных чисел в списке*/