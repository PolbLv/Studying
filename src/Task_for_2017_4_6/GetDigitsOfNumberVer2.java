package Task_for_2017_4_6;

import java.util.ArrayList;


/**
 * Created by LVIVSOFT\spolyakov on 10.04.17.
 */
public class GetDigitsOfNumberVer2 {
    public static void main(String args[]) {

        int myNum = 3781;
        ArrayList<Integer> digits = getDigitsOfNumber(myNum);
        System.out.println(digits);
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

/*1. Создать метод разбивающий число на цифры, на выходе должен быть список чисел.
Сигнатура метода: public static ArrayList<Integer> getDigitsOfNumber(int number)
Выходной список должен содержать цифры идущие в том же самом порядке, что и в числе
Пример: на входе число 3781, выходной список должен быть таким
[3,7,8,1] - то есть первая цифра в списке соответствует первой цифре в числе.*/