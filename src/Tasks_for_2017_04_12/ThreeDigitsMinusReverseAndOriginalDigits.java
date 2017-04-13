package Tasks_for_2017_04_12;


public class ThreeDigitsMinusReverseAndOriginalDigits {
    public static void main(String args[]) {
        int minus;
        int r;
        for (int i = 100; i < 1000; i++) {
            r = getLastToFirstDigitsOfNumber(i);
            minus = i - r;
            if (minus > 0) {
                System.out.println("i = " + i + " r = " + r + " sum = " + minus);
            }
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

/*Вывести на экран разницу (операцию минус) развернутого числа
и оригинального числа только если она (разница) больше нуля. Для всех трехзначных чисел
*/