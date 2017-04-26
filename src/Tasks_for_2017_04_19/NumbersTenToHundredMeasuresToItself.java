package Tasks_for_2017_04_19;

import java.util.ArrayList;
import java.util.List;

public class NumbersTenToHundredMeasuresToItself {
    public static void main(String args[]) {

        List<Integer> myList = populateList(100, 20);
        for (int i = 0; i < myList.size(); i++) {
         //   if (method(myList.get(i))){
                System.out.println();
            }



            }
    //}

    public static String method(int n) {
        String res = " ";
        for (int i = 1; i <= n; i++) {
            if (0 == (n % i)) {
                res += i + " , ";
                System.out.println(i);
            }
        }
        return res;
    }

    public static List<Integer> populateList(int size, int limit) {
        List<Integer> random = new ArrayList<>();

        for (int i = 0; i < size; i++) {

            random.add((int) (Math.random() * (limit + 1)));
        }
        System.out.println(random);
        return random;
    }
}


/*Для каждого из чисел от 10 до 100 вывести все их делители. Например:
        10 - 1 2 5
        11 - 1
        12 - 1 2 3 6
        13 - 1
        14 - 1 2 7
        15 - 1 3 5
        ,,,
        50 - 1 2 5 10 25 */