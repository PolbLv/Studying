package Tasks_for_2017_04_13;


import java.util.ArrayList;
import java.util.List;


public class ThousandRandomDigitsAndIsSimple {
    public static void main(String args[]) {
       int sum = 0;
        List<Integer> myList = populateList(1000, 100);
        for (int i = 0; i < myList.size(); i++) {
            if (isSimple(i)) {
                sum = sum + myList.get(i);
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
/*5, Заполнить список 1000й случайных чисел,
вывести сумму тех элементов у которых индекс простое число.*/
