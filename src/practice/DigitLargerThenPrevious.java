package practice;

import java.util.ArrayList;

/**
 * Created by LVIVSOFT\spolyakov on 31.03.17.
 */
public class DigitLargerThenPrevious {
    public static void main(String args[]) {

        ArrayList<Integer> myList = populateList();
        for (int k = 1; k < myList.size(); k++) {
            int num = myList.get(k);
            if (num > myList.get(k - 1))
                System.out.println(num);
        }
        System.out.println(myList);

    }

    public static ArrayList<Integer> populateList() {
        ArrayList<Integer> myList = new ArrayList<>();
        for ( int i = 0 ; i < 13; i++) {
            myList.add((int) (Math.random() * ( 500 + 1)));
        }
        return myList;
    }
}
/*Используя метод populateList создать список случайных чисел от 0 до 500,
вывести на экран количество четных чисел в списке*/