package Old;

import static java.lang.Math.*;

/**
 * Created by Serhiy on 2/27/17.
 */
public class Sumdoubletohundred {
    public static void main (String args[]){
        sumdoubleTohundred(100);
    }
    public static void sumdoubleTohundred(int x) {
        int sum = 0;
        for (int i = 0; i <= x; i++) {
            if (i % 2 != 0){
                sum = sum + (int) Math.pow(i,2);
            }
        }
        System.out.println(sum);
    }
}


/*Вывести сумму всех квадратов нечетных чисел в диапазоне 0-100
Результат будет равен : 166650*/