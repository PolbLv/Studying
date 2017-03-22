/**
 * Created by Serhiy on 3/17/17.
 */
public class Forhundredtozero {
    public static void main (String args[]){

        hundredtozero(0);
    }
    public static void hundredtozero(int x) {
        for (int i = 100; i >= x; --i) {
            if (i % 2 == 0) {
                System.out.println("i = " + i);
            }
        }
    }
}

//Вывести все четные числа от 100 до 0. Использовать цикл for

