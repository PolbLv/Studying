package Tasks_for_2017_04_12;

import java.util.ArrayList;

public class SixDigitsNumbersFirstAndLastDigitsIfSumCountDigit {
    public static void main(String args[]) {
        ArrayList<Integer> sum;

        for (int i = 0; i < 100000; i++) {
            if (isSimple(i) ) {
                sum = getDigitsOfNumber(i);
                if ((sum.get(0) + sum.get(sum.size() - 1)) % 2 == 0){

                    System.out.println(i);
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

//Вывести все простые числа от 0 до 100000 у которых сумма первой и последней цифры четное число