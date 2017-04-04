package Tasks_for_2017_03_27;

import java.util.ArrayList;

/**
 * Created by Serhiy on 4/5/17.
 */
public class PopulateArrayRandomAndSimpleDigits {
    public static void main(String args[]){

    }
    public static ArrayList<Integer> populateList() {
        ArrayList<Integer> myList = new ArrayList<>();
        for (int i = 0; i < 13; i++) {
            myList.add((int) (Math.random() * (500 + 1)));
        }
        return myList;
    }

    public static boolean isSimple (int num) {
        for (int x = 2; x < num; x++) {
            if (num % x == 0) {
                return false;
            }
        }
        return true;
    }
}
/*Используя метод populateList создать список случайных чисел от 0 до 500,
вывести на экран количество простых чисел в списке*/