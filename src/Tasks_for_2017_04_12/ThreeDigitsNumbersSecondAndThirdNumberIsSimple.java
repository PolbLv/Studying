package Tasks_for_2017_04_12;

import java.util.ArrayList;

public class ThreeDigitsNumbersSecondAndThirdNumberIsSimple {
    public static void main(String args[]) {
        int sum = 0;
        for (int i = 100; i < 1000; i++) {
            sum = getDigitsOfNumber(i).get(1) + getDigitsOfNumber(i).get(2);
            if (isSimple(sum)) {
                System.out.println("i  = " + i + " sum = " + sum);
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
        if (num == 0 || num ==1) {
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
//Вывести все трехзначные числа у которых сумма второй и третьей цифры простое число

