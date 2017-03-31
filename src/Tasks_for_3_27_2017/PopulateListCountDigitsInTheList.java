package Tasks_for_3_27_2017;

import java.util.ArrayList;

/**
 * Created by LVIVSOFT\spolyakov on 31.03.17.
 */
public class PopulateListCountDigitsInTheList {
    public static void main(String args[]) {

        populateList(14);
    }

    public static void populateList(int max) {
        ArrayList<Integer> random = new ArrayList<>();
        int i;
        for ( i = 0; i < max; i++) {
       //     if ( i % 2 == 0) {
            random.add((int) (Math.random() * (max + 1)));



            }

         //   return random;
        }
      //  System.out.println(random);
    }


/*Используя метод populateList создать список случайных чисел от 0 до 500,
вывести на экран количество четных чисел в списке*/