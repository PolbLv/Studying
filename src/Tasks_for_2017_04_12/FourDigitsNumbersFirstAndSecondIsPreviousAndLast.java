package Tasks_for_2017_04_12;

import java.util.ArrayList;

/**
 * Created by LVIVSOFT\spolyakov on 12.04.17.
 */
public class FourDigitsNumbersFirstAndSecondIsPreviousAndLast {
    public static void main (String args []){
        for (int i = 1000; i < 10000; i++){
            if (getDigitsOfNumber(i).get(0) == getDigitsOfNumber(i).get(2) && getDigitsOfNumber(i).get(1) == getDigitsOfNumber(i).get(3)){
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


 /*   Вывести все четырехзначные числа у которых
    первые две цифры равны последним двум цифрам , например числа как 1212, 7373,9595, 1111,9090*/