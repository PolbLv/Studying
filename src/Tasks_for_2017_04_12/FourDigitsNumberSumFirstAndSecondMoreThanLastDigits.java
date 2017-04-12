package Tasks_for_2017_04_12;

import java.util.ArrayList;

/**
 * Created by LVIVSOFT\spolyakov on 12.04.17.
 */
public class FourDigitsNumberSumFirstAndSecondMoreThanLastDigits {
    public static void main(String args[]) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 1000; i < 10000; i++) {
            sum1 = getDigitsOfNumber(i).get(0) + getDigitsOfNumber(i).get(1);
            sum2 = getDigitsOfNumber(i).get(2) + getDigitsOfNumber(i).get(3);
            if (sum1 > sum2) {
                System.out.println("i = " + i);
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
}
// Вывести все четырехзначные числа у которых сумма первых двух цифр
// больше суммы последних двух цифр. Например: 1220 (3>2), 5612 (11>3)