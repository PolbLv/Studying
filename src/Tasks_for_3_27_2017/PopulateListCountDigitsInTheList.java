package Tasks_for_3_27_2017;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LVIVSOFT\spolyakov on 31.03.17.
 */
public class PopulateListCountDigitsInTheList {
    public static void main(String args[]) {

        populateList(500);
    }

    public static List<Integer> populateList(int limit) {
        //int counter = 0;
        List<Integer> random = new ArrayList<>();
        for (int i = 0; i < limit; i++) {

            random.add((int) (Math.random() * (limit + 1)));
            if (i % 2 == 0)
                // counter++;

                    System.out.println (random);
            }
            //System.out.println(counter);
        return random;
        }

    }






/*Используя метод populateList создать список случайных чисел от 0 до 500,
вывести на экран количество четных чисел в списке*/