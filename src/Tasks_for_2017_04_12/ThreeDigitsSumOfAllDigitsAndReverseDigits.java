package Tasks_for_2017_04_12;


public class ThreeDigitsSumOfAllDigitsAndReverseDigits {
    public static void main(String args[]) {
        int sum;
        int r;
        for (int i = 100; i < 1000; i++) {
            r = getLastToFirstDigitsOfNumber(i);
            sum = i + r;
            System.out.println("i = " + i + " r = " + r + " sum = " + sum);
        }
    }

    public static int getLastToFirstDigitsOfNumber(int num) {
        int r = 0;
        while (num > 0) {
            r = r * 10 + num % 10;
            num /= 10;
        }
        return r;
    }
}


/*Вывести на экран суммы числа и его развернутого числа,
для всех трехзначных чисел. 478 + 874 = 1352, 123 + 321 = 444*/