package Tasks_for_2017_04_19;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by LVIVSOFT\spolyakov on 19.04.17.
 */
public class HundredRandomDigitsWhereFivePresentedAndFoldSix {
    public static void main(String args[]) {
        randomDigits(100);
    }

    public static void randomDigits(int size) {
        Random random = new Random();
        int counter = 0;
        while (counter < size) {
            int result = random.nextInt(1000) + 1;
            if (result % 6 == 0 && numbersWithDigitFour(result)) {
                System.out.println("i = " + result);
                counter++;
            }
        }
    }

    public static boolean numbersWithDigitFour(int x) {
        ArrayList<Integer> var = getDigitsOfNumber(x);
        for (int i = 0; i < var.size(); i++) {
            if (var.get(i) == 5) {
                return true;
            }
        }
        return false;
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

/*Сгенерировать список из 100 случайных чисел (от 0 до 1000),
вывести числа из списка в которых присутствует цифра 5 и которые кратны шести.*/