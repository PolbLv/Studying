package Tasks_for_2017_04_19;

import java.util.ArrayList;
import java.util.List;

public class NumbersTenToHundredMeasuresToItself {
    public static void main(String args[]) {
        int n = 0;
        List<Integer> myList = getDigitsOfNumber(100);
        for (int i = 0; i < myList.size(); i++) {
           // if (method(n) == myList.size()) {
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

    public static ArrayList<Integer> getDigitsOfNumber(int num) {
        ArrayList<Integer> digits = new ArrayList<>();
        while (num > 0) {
            digits.add(0, num % 10);
            num /= 10;
        }
        return digits;
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