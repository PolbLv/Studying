package Task_for_2017_03_31;

/**
 * Created by LVIVSOFT\spolyakov on 03.04.17.
 */
public class SumAllNumbers {
    public static void main(String args[]) {
        sumNumbers(115566);
    }

    public static void sumNumbers(int x) {
        int sum = 0;
        while (x > 0) {
            sum = sum + x % 10;
            x = x / 10;
        }
        System.out.println(sum);
    }
}


/*Написать метод суммирующий все цифры в входном числе. Например на входе число 115566 - на выходе будет 24
(1 + 1 + 5 +5 + 6 +6 =24)*/


