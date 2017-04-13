package Tasks_for_2017_04_12;

import java.util.ArrayList;

public class SixDigitsNumbersFirstAndLast {
    public static void main(String args[]) {
        ArrayList<Integer> numbers;

        for (int i = 0; i < 100000; i++) {
            numbers = getDigitsOfNumber(i);
            if (numbers.get(0) == numbers.get(numbers.size() - 1)) {
                System.out.println(i);
            }
        }
    }

    public static ArrayList<Integer> getDigitsOfNumber(int num) {
        ArrayList<Integer> digits = new ArrayList<>();
        if (num == 0) {
            digits.add(0);
            return digits;
        }
        while (num > 0) {
            digits.add(0, num % 10);
            num /= 10;
        }
        return digits;
    }
}

/*    Вывести все числа от нуля до 100000
у которых первая и последняя цифры одинаковы. */