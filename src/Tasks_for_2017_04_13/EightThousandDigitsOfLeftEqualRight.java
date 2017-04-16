package Tasks_for_2017_04_13;

import java.util.ArrayList;


public class EightThousandDigitsOfLeftEqualRight {
    public static void main(String args[]) {
        int sum1;
        int sum2;
        for (int i = 10000000; i < 100000000; i++) {
            sum1 = getDigitsOfNumber(i).get(0) + getDigitsOfNumber(i).get(1) + getDigitsOfNumber(i).get(2) + getDigitsOfNumber(i).get(3);
            sum2 = getDigitsOfNumber(i).get(4) + getDigitsOfNumber(i).get(5) + getDigitsOfNumber(i).get(6) + getDigitsOfNumber(i).get(7);
            if (sum1 == sum2) {
                System.out.println(" i = " + i + " Left =  " + sum1 + " Right = " + sum2);
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

/*Вывести тысячу 8 значных чисел в которых сумма цифр справа равна сумме цифр слева. Например:
12303300 - 1 + 2 + 3 +0 = 6 ; 3+3+0+0 = 6 - суммы одинаковы, выводим на экран*/