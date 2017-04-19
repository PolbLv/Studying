package Tasks_for_2017_04_13;

import java.util.ArrayList;

/**
 * Created by LVIVSOFT\spolyakov on 14.04.17.
 */
public class FourthDigitsAllDigitsCountAndFirstAndThirdIsSimple {
    public static void main(String args[]) {
        int numbers;
        int sum;
        for (int i = 1000; i < 10000; i++) {
            sum = getDigitsOfNumber(i).get(0) + getDigitsOfNumber(i).get(1) + getDigitsOfNumber(i).get(2) + getDigitsOfNumber(i).get(3);
            numbers = getDigitsOfNumber(i).get(0) * 10 + getDigitsOfNumber(i).get(2);
            if (sum % 2 == 0 && isSimple(numbers)) {

                System.out.println("i = " + i + " sum = " + sum + " isSimple = " + numbers);
            }

        }
    }

    public static ArrayList<Integer> getDigitsOfNumber(int num) {
        ArrayList<Integer> digits = new ArrayList<>();
        while (num > 0) {
            digits.add(0, num % 10);
            num /= 10;
        }
        return digits;
    }

    public static boolean isSimple(int num) {
        if (num == 0) {
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
/*1. Вывести все 4 значные числа у которых сумма всех цифр четное число и
число сформированное из первой и третьей цифры простое число.
1414 - сумма цифр = 10, число 11 - простое число. 3218 - сумма цифр = 14 , число 31 - простое*/