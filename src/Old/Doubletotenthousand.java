package Old;

/**
 * Created by Serhiy on 2/27/17.
 */
public class Doubletotenthousand {
    public static void main (String args[]){

        doubleTotentousand(10000);
    }
    public static void doubleTotentousand(int x) {
        for (int i = 0; i <= x; i++) {
            if (Math.sqrt(i) % 2 == 0 && Math.sqrt(i) % 7 == 0 ) {
                System.out.println("number = " + i + " square root = " + (int) Math.sqrt(i) );
            }
        }
    }
}

/*Вывести на экран числа в последовательности 0-10000 квадратный корень которых четное число кратное 7
Результат:
number = 0; square root = 0
number = 196; square root = 14
number = 784; square root = 28
number = 1764; square root = 42
number = 3136; square root = 56
number = 4900; square root = 70
number = 7056; square root = 84
number = 9604; square root = 98 */