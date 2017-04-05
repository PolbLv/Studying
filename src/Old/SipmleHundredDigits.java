package Old;

/**
 * Created by LVIVSOFT\spolyakov on 27.03.17.
 */
public class SipmleHundredDigits {
    public static void main(String args[]) {
        printSimpleDigitsToHundred(1000);

    }

    public static void printSimpleDigitsToHundred(int y) {
        int sum = 0;
        int x = 2;
        int counter = 0;
        while (counter < y) {
            if (simple(x)) {
                sum = sum + x;
                System.out.println("Sum " + sum);
                counter++;
            }
            x++;
        }
    }

    public static boolean simple(int num) {
        if (num == 0) {
            return false;
        }
        for (int x = 2; x < num; x++) {
            if (num % x == 0) {
                return false;
            }
        }
        return true;
    }
}


//Используя цикл вывести на консоль сумму первых 1000 простых чисел
/*внутри должен быть цикл while который должен считать до момента пока не получишь 1000 простых чисел,
 плюс должна быть переменная в которую ты будешь складывать результат суммирования простых чисел*/
