package Task_for_2017_03_31;

import java.util.ArrayList;

/**
 * Created by LVIVSOFT\spolyakov on 04.04.17.
 */
public class TwentyPositiveNumbers {
    public static void main(String args[]) {
        twentyNumbers();

    }

    public static void twentyNumbers() {
        int initialSize = 3000;
        int x = 0;
        ArrayList<Integer> numbers = new ArrayList<>(initialSize);
        for (int i = 0; i < initialSize; i++) {
            numbers.add(i);
            if (  Math.sqrt(i) % 1 == 0 && simple((int) (Math.sqrt(i)) - 3))
                System.out.println(i);
        }
    }
        public static boolean simple(int num) {
            for (int x = 2; x < num; x++) {
                if (num % x == 0) {
                    return false;
                }
            }
            return true;
        }
    }


/*Вывести 20 положительных чисел из последовательности для которой верны следующие условия:
корень числа - целое число, корень числа минус 3 - простое число
результат:
0
1
4
9
16
25
36
64
100
196
256
400
484
676
1024
1156
1600
1936
2116
2500*/