package Task_for_2017_04_24;

import java.util.ArrayList;
import java.util.List;

public class TwoHundredRandomDigitsNotCountSumDigitsAndIndexIsSimple {
    public static void main(String args []){
        int sum = 0;
        List<Integer> myList = populateList(200, 100);
        for (int i = 0; i < myList.size(); i++){
            if (myList.get(i) % 2 != 0){
                sum = myList.get(i) + i;
                if (isSimple(sum)){
                    System.out.println(" sum = " + sum);
                }
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
/*Создать список из 200 случайных чисел (от 0 до 100) - вывести
все нечетные числа для которых сумма числа и его индекса простое число*/