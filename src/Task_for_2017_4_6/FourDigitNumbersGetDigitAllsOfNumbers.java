package Task_for_2017_4_6;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LVIVSOFT\spolyakov on 11.04.17.
 */
public class FourDigitNumbersGetDigitAllsOfNumbers {
    public static void main(String args[]) {
        //int counter = 0;
        for (int i = 1000; i < 10000; i++) {
            if (isHave3Digits(i) /*&& i % 3 ==0*/) {
                //  if (i % 2 ==0){
                // counter++;
                System.out.println(i);
            }
        }
    }
    // System.out.println(counter);

    public static ArrayList<Integer> getDigitsOfNumber(int num) {
        ArrayList<Integer> digits = new ArrayList<>();
        while (num > 0) {
            digits.add(0, num % 10);
            num /= 10;
        }
        return digits;
    }


    public static boolean isHave3Digits(int x) {
        List<Integer> digits = getDigitsOfNumber(x);
        int counter = 0;
        int previousDigit = 0;
        for (Integer currentDigit : digits) {
            if (currentDigit == previousDigit) {
                counter++;
            } else {
                counter = 0;
            }
            previousDigit = currentDigit;
        }
        if (counter >= 2) {
            return true;
        }
        return false;
    }
}
/*Используя метод getDigitsOfNumber вывести все четырехзначные числа
в которых имеется последовательность из 3 одинаковых чисел.*/