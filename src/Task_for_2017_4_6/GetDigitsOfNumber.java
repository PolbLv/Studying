package Task_for_2017_4_6;

import java.util.ArrayList;

/**
 * Created by LVIVSOFT\spolyakov on 10.04.17.
 */
public class GetDigitsOfNumber {
    public static void main(String args[]) {

        ArrayList<Integer> myList = getDigitsOfNumber(3781);
        System.out.println(myList);
    }


    public static ArrayList<Integer> getDigitsOfNumber(int number) {
        ArrayList<Integer> myList = new ArrayList<>();
        StringBuffer digits = new StringBuffer(String.valueOf(number));
        for (int i = 0; i < digits.length(); i++) {
            myList.add(Character.digit(digits.charAt(i), 10));

        }
        return myList;
    }
}



/*1. Создать метод разбивающий число на цифры, на выходе должен быть список чисел.
Сигнатура метода: public static ArrayList<Integer> getDigitsOfNumber(int number)
Выходной список должен содержать цифры идущие в том же самом порядке, что и в числе
Пример: на входе число 3781, выходной список должен быть таким
[3,7,8,1] - то есть первая цифра в списке соответствует первой цифре в числе.*/
