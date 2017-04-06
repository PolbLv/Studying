package Task_for_2017_4_6;

import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Test
{

    public static void main(String[] args) {
        getDigitsOfNumber(3781);
        ArrayList<Integer> digits = getDigitsOfNumber();
        System.out.println(Arrays.toString(digits));
    }

    public static ArrayList<Integer> getDigitsOfNumber(int number) {
        List<Integer> digits = new ArrayList<>();
        for(int i = 0; i < number; i++) {
            int j = Character.digit(number.charAt(i), 10);
            digits.add(j);
        }
        return digits.toArray(new Integer[]{});
    }
}
//http://stackoverflow.com/questions/19063001/extracting-digits-of-int-in-java


/*1. Создать метод разбивающий число на цифры, на выходе должен быть список чисел. Сигнатура метода: public static ArrayList<Integer> getDigitsOfNumber(int number)
Выходной список должен содержать цифры идущие в том же самом порядке, что и в числе
Пример: на входе число 3781, выходной список должен быть таким
[3,7,8,1] - то есть первая цифра в списке соответствует первой цифре в числе.*/
