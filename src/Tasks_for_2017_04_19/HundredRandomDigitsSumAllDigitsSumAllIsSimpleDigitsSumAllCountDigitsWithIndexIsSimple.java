package Tasks_for_2017_04_19;

import java.util.ArrayList;
import java.util.List;

public class HundredRandomDigitsSumAllDigitsSumAllIsSimpleDigitsSumAllCountDigitsWithIndexIsSimple {
    public static void main(String args[]) {
        int sumAllNumbers = 0;
        int sumAllNumbersIsSimple = 0;
        int sumCountNumbersIsSimple = 0;
        List<Integer> myList = populateList(1000, 100);
        for (int i = 0; i < myList.size(); i++) {
            sumAllNumbers = sumAllNumbers + myList.get(i);
            if ( isSimple(myList.get(i))){
                sumAllNumbersIsSimple = sumAllNumbersIsSimple + myList.get(i);
            }
            if (myList.get(i) % 2 == 0 && isSimple(i)) {
                sumCountNumbersIsSimple = sumCountNumbersIsSimple + myList.get(i);
            }
           /* System.out.println(" i = " + i + " el = " + myList.get(i) + " sumAllNumbers = " + sumAllNumbers +
                    " sumAllNumbersIsSimple =  " + sumAllNumbersIsSimple + " sumCountNumbersIsSimple = " + sumCountNumbersIsSimple);*/
        }
       System.out.println(" sumAllNumbers = " + sumAllNumbers + " sumAllNumbersIsSimple =  "
                + sumAllNumbersIsSimple + " sumCountNumbersIsSimple = " + sumCountNumbersIsSimple);
    }


    public static List<Integer> populateList(int size, int limit) {
        List<Integer> random = new ArrayList<>();

        for (int i = 0; i < size; i++) {

            random.add((int) (Math.random() * (limit + 1)));
        }
       // System.out.println(random);
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

/*Сгенерировать список из 100 случайных чисел (от 0 до 1000),
вывести на экран сумму всех чисел. Вывести на экран сумму всех простых чисел из списка.
Вывести сумму всех четных чисел из списка у которых индекс простое число*/
