package Task_for_2017_04_24;


import java.util.ArrayList;
import java.util.List;

public class TwoHundredRandomDigitsDoubleIndexesIsSimple {
    public static void main(String args[]) {
        double sqrt = 0;
        List<Integer> myList = populateList(200, 100);
        for (int i = 0; i < myList.size(); i++) {
            sqrt = Math.sqrt(myList.get(i)) ;
            if (sqrt  % 1 == 0)
                    if (isSimple((int)sqrt)) {
                        System.out.println("Index = " + i + " " + sqrt + " el = " + myList.get(i));
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
/*Создать список из 200 случайных чисел (от 0 до 100) -
вывести все индексы для которых выполняется условие - квадратный корень
соответсвующего числа из списка простое число*/