package Task_for_2017_04_24;

import java.util.ArrayList;
import java.util.List;

public class TwoHundredRandomDigitsSumCountDigits {
    public static void main(String args[]) {
        int sumIndex = 0;
        List<Integer> myList = populateList(10, 10);
        for (int i = 0; i < myList.size(); i++) {
            if (i % 2 == 0) {
                sumIndex = i + myList.get(i);
                System.out.println(" sumIndex = " + sumIndex /*+ " el = " + myList.get(i) + " index = " + i */ );
            }
        }
    }

    public static List<Integer> populateList(int size, int limit) {
        List<Integer> random = new ArrayList<>();

        for (int i = 0; i < size; i++) {

            random.add((int) (Math.random() * (limit + 1)));
        }
        System.out.println(random);
        return random;
    }

    public static ArrayList<Integer> getDigitsOfNumber(int num) {
        ArrayList<Integer> digits = new ArrayList<>();
        while (num > 0) {
            digits.add(0, num % 10);
            num /= 10;
        }
        return digits;
    }

}
/*    Создать список из 200 случайных чисел (от 0 до 100) -
        для четных индексов вывести сумму индекса и соответствующего элемента из списка.*/