package Tasks_for_2017_04_12;

import java.util.ArrayList;


public class FourDigitsSumFirstAndSecondEquallyThirdAndFourth {
    public static void main(String args[]) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 1000; i < 10000; i++) {
            sum1 = getDigitsOfNumber(i).get(0) + getDigitsOfNumber(i).get(1);
            sum2 = getDigitsOfNumber(i).get(2) + getDigitsOfNumber(i).get(3);
            if (sum1 == sum2) {
                System.out.println(i);
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

/*Вывести все 4 значные числа для которых сумма первых двух цифр равна сумме последних двух цифр:
пример 1221, 6134, 7596*/