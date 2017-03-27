/**
 * Created by Serhiy on 3/16/17.
 */
public class Notcountdigtszerototwohundred {
    public static void main(String args[]) {

        hundredtozero(100);
    }

    public static void hundredtozero(int x) {
        int i = 0;
        while (i < x) {
            if (x % 2 != 0) {
                System.out.println("i = " + x);
            }
            x--;
        }
    }
}

//Вывести все нечетные числа от 100 до 0. Использовать цикл while