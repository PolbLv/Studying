package Tasks_for_2017_04_13;

import java.util.ArrayList;


public class FourthDigitsAllNumbersWithDigitFour {
    public static void main(String args[]) {

        int counter = 0;
        for (int i = 10000; i < 100000; i++) {
            if (numbersWithDigitFour((i))) {
                System.out.println("i = " + i + " counter = " + counter);
                counter++;
            }
        }
    }

    public static boolean numbersWithDigitFour(int x) {
        ArrayList<Integer> var = getDigitsOfNumber(x);
        for (int i = 0; i <var.size(); i++) {
            if (var.get(i) == 4) {
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

/* 2. Вывести все числа в диапазоне 1000-10000 в которых присутствуют цифры "4".
Подсчитать количество цифр и вывести их на экран. Примеры:
1011 - не выводим ничего
4000 - присутсвует циферка 4 - выводим на экран "4000 - 1" - где цифра "1" - количество найденых цифр в начальном числе
3440 - присутсвует циферка 4 - выводим на экран "3440 - 2" - где цифра "2" - количество найденых цифр в начальном числе*/