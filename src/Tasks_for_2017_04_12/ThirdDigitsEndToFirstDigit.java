package Tasks_for_2017_04_12;

public class ThirdDigitsEndToFirstDigit {
    public static void main(String args[]) {
        int r;
        for (int i = 100; i < 1000; i++) {
            r = getLastToFirstDigitsOfNumber(i);
            System.out.println("i = " + i + " r = " + r);
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



/*Создать метод разворачивающий трехзначное число на входе,
например на вход метода подаешь число 123 - на выходе будет 321. 153 - 351, 546 - 645
Вывести все трехзначные числа и их "развернутые" значения - типа
i = 100 r = 1
i = 101 r = 101
i = 102 r = 201*/