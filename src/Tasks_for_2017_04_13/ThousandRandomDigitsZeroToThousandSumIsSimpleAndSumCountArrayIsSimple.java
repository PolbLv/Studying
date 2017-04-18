package Tasks_for_2017_04_13;

import java.util.ArrayList;
import java.util.List;


public class ThousandRandomDigitsZeroToThousandSumIsSimpleAndSumCountArrayIsSimple {
    public static void main(String args[]) {

        int sum1 = 0;
        int sum2 = 0;
        List<Integer> myList = populateList(10, 20);
        for (int i = 0; i < myList.size(); i++) {
            if (isSimple(myList.get(i))) {
                sum1 = sum1 + myList.get(i);
                // System.out.println(" i = " + i + " ArrayList = " + sum1);
            }
            if (isSimple(i) && myList.get(i) % 2 == 0) {
                sum2 = sum2 + myList.get(i);
                //   System.out.println("i = " + i + " My List get  " + myList.get(i) + " sum What ? = " + sum2);
            }
        }
        System.out.println("sum2 = " + sum2);
        System.out.println("sum1 = " + sum1);
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
/*6, Заполнить список 1000 -й случайных чисел (числа от 0 до 1000),
вывести на экран сумму всех простых чисел из этого массива,
а также вывести на экран сумму всех четных чисел из этого массива, индекс которых простое число.*/