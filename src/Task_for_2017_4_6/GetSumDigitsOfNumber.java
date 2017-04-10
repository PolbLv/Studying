package Task_for_2017_4_6;

import java.util.ArrayList;

/**
 * Created by LVIVSOFT\spolyakov on 10.04.17.
 */
public class GetSumDigitsOfNumber {
    public static void main(String args[]) {

        getDigitsOfNumber(8754);

    }

    public static ArrayList<Integer> getDigitsOfNumber(int num) {
        ArrayList<Integer> digits = new ArrayList<>();
        int sum = 0;
        while (num > 0) {
            digits.add(0, num % 10);
            sum = sum + num % 10;
            num /= 10;
        }
        System.out.println("Sum = " + sum);
        return digits;
    }
}


/*Используя метод getDigitsOfNumber
найти сумму всех цифр для следующих чисел: 8754, 45542, 54857,1111101*/