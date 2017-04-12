package Tasks_for_2017_04_12;

import java.util.ArrayList;


public class FourDigitsNumbersSumInIncrementsEleven {
    public static void main(String args[]) {
        int sum = 0;
        for (int i = 1000; i < 10000; i++) {
            sum = sum + i;
            if (sum % 11 == 0) {
                System.out.println("i = " + i + " sum = " + sum);
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

// Вывести все четырехзначные числа у которых сумма всех цифр кратна числу 11