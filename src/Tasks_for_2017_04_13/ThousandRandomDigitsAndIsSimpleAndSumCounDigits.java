package Tasks_for_2017_04_13;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Serhiy on 4/16/17.
 */
public class ThousandRandomDigitsAndIsSimpleAndSumCounDigits {
    public static void main (String args[]){
        int sum = 0;
        int sum1 = 0;
        List<Integer> myList = populateList(4, 10);
        for (int i = 0; i < myList.size(); i++) {
            if (isSimple(i) && i % 2 == 0) {
                sum = sum + myList.get(i);
                {
                  //  sum1 = sum + myList.get(i);
                }

                System.out.println(" i = " + i + " el = " + myList.get(i));
            }
        }

        System.out.println("sum = " + sum);
    }

    public static List<Integer> populateList(int size, int limit) {
        List<Integer> random = new ArrayList<>();

        for (int i = 0; i < size; i++) {

            random.add((int) (Math.random() * (limit + 1)));
        }
        System.out.println(random);
        return random;
    }

    public static boolean isSimple(int num) {
        if (num == 0 || num == 1) {
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

/*Заполнить список 1000й случайных чисел (числа от 0 до 1000),
вывести на экран сумму всех простых чисел из этого массива,
а также вывести на экран сумму всех четных чисел из этого массива, индекс которых простое число.*/