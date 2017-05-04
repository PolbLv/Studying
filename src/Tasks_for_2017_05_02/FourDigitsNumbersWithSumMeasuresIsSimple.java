package Tasks_for_2017_05_02;

import java.util.ArrayList;

public class FourDigitsNumbersWithSumMeasuresIsSimple {
    public static void main(String args[]) {

        int sum;

        ArrayList<Integer> digits;

        for (int i = 1000; i < 10000; i++) {
            digits = getDenominatorsOf(i);
            sum = 0;

            for (int j = 0; j < digits.size(); j++) {
                sum = sum + digits.get(j);
                }
            if (isSimple(sum)) {
                System.out.println(i);
            }
        }
    }

    public static ArrayList<Integer> getDenominatorsOf(int number) {
        ArrayList<Integer> digits = new ArrayList<>();

        for (int i = 1; i < number; i++) {
            if (0 == (number % i)) {
                digits.add(i);
            }
        }
        return digits;
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
//  Вывести все 4х значные числа у которых сумма делителей простое число.