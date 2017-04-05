package Old;

import java.util.Random;

/**
 * Created by Serhiy on 2/22/17.
 */
public class CountRandomClasses {
    public static void main(String arg[]) {

        randomClass(100);
    }

    public static void randomClass(int x) {
        int counter = 0;
        Random random = new Random();
        for (int i = 0; i <= x; i++) {
            int number = random.nextInt(100);
            if (number % 2 != 0) {
                counter++;
                System.out.println(number);
            }
        }
        System.out.println("counter = " + counter);
    }
}
//    Вывести рендомно от нуля до ста непарные числа и подсчитать их коунтером