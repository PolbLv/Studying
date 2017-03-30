package Old;

/**
 * Created by Serhiy on 2/22/17.
 */
public class Sumxtoy {
    public static void main(String arg[]) {
//        sumXtoY(4, 8);
        sumXtoYodd(70, 90);
    }

    public static void sumXtoY(int x, int y) {
        int sum = 0;
        for (int i = x; i <= y; i++) {
            sum = sum + i;
        }
        System.out.println("Sum = " + sum);
    }

    public static void sumXtoYodd(int x, int y) {
        int sum = 0;
        for (int i = x; i <= y; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        System.out.println("sum = " + sum);
    } //   Метод который выводит сумму всех непарных чисел от 70 до 90
}

//Создать метод подсчитывающий сумму всех чисел в заданом диапазоне например от 52 до 88