package Tasks_for_2017_04_12;

import java.util.ArrayList;


public class ThreeDigitNumbersSumFirstAndSecondDigitsEvenNumber {
    public static void main(String args[]) {
        int sum = 0;
        for (int i = 100; i < 1000; i++) {
            sum = getDigitsOfNumber(i).get(0) + getDigitsOfNumber(i).get(2);
            if (sum % 2 == 0) {
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
//Вывести все трехзначные числа у которых сумма первой и третьей цифры четное число.