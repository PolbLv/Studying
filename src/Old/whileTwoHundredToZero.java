package Old;

/**
 * Created by Serhiy on 3/15/17.
 */
public class whileTwoHundredToZero {
    public static void main(String args[]) {
        twoHundredToZero(0);
    }

    public static void twoHundredToZero(int x) {
        int counter = 200;
        while (counter > x) {
            System.out.println("i = " + counter);
            counter--;
        }
        x--;
    }
}

//Вывести числа от 200 до 0 используя цикл while