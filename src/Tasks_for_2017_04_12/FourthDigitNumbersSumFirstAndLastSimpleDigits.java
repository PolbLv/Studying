package Tasks_for_2017_04_12;

import java.util.ArrayList;

/**
 * Created by LVIVSOFT\spolyakov on 12.04.17.
 */
public class FourthDigitNumbersSumFirstAndLastSimpleDigits {
    public static void main(String args[]) {
        int sum = 0;
        int increase = 0;
        for (int i = 1000; i < 10000; i++) {
            sum = getDigitsOfNumber(i).get(0) + getDigitsOfNumber(i).get(3);
            if (isSimple(sum)) {
                increase = getDigitsOfNumber(i).get(1) * getDigitsOfNumber(i).get(2);
                if (increase % 2 != 0) {
                    System.out.println("i =  " + i + " sum " + sum + " increase = " + increase);
                }

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

/*Подсчитать количество четырехзначных чисел у которых сумма
первой и последней цифр простое число, а произведение средних цифр нечетное число*/