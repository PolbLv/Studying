/**
 * Created by Serhiy on 3/16/17.
 */
public class twentyfivedigits {
    public static void main(String args[]) {

        twentyfive(0,200);
    }

    public static void twentyfive(int x, int y) {
        int counter = 0;
        while (counter <= y) {
            if (x % 25 == 0) {
                System.out.println("i = " + x);
                counter++;
            }
            x++;
        }
    }
}

//Вывести первые 200 чисел кратных 25 начиная от нуля.