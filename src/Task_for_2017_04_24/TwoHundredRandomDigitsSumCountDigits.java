package Task_for_2017_04_24;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Serhiy on 4/24/17.
 */
public class TwoHundredRandomDigitsSumCountDigits {
    public static void main(String args) {
        int sum = 0;
        List<Integer> myList = populateList(10, 200);
        for (int i = 0; i < myList.size(); i++) {
            sum = sum + myList.get(i);
            if ((myList.get(i) % 2 == 0)){
                System.out.println(sum);
            }
        }
    }

        public static List<Integer> populateList ( int size, int limit){
            List<Integer> random = new ArrayList<>();

            for (int i = 0; i < size; i++) {

                random.add((int) (Math.random() * (limit + 1)));
            }
            // System.out.println(random);
            return random;
        }
    }


/*    Создать список из 200 случайных чисел (от 0 до 100) -
        для четных индексов вывести сумму индекса и соответствующего элемента из списка.*/