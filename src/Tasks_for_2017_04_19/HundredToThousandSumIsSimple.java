package Tasks_for_2017_04_19;

import java.util.ArrayList;

public class HundredToThousandSumIsSimple {
    public static void main(String args[]) {
        int i;
        int sum;

        for (i = 100; i < 10000; i++) {
            sum = getSumОfDigitsOfNumber(i);
            if (isSimple(sum)) {
                System.out.println(" i = " + i + " sum = " + sum);
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

    public static int getSumОfDigitsOfNumber(int num) {
        ArrayList<Integer> digits = getDigitsOfNumber(num);
        int sum = 0;
        for (int i = 0; i < digits.size(); i++) {
            sum += digits.get(i);
        }
        return sum;
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

/* Вывести все числа от 100 до 10000 у которых сумма цифр простое число.*/