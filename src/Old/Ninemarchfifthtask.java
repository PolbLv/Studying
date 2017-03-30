package Old;

/**
 * Created by Serhiy on 3/11/17.
 */
public class Ninemarchfifthtask {
    public static void main(String args[]) {

        sumzeroTohundred(100);

    }

    public static void sumzeroTohundred(int x) {
        for (int i = 0; i <= x; i++) {
                double pi = i + Math.sqrt(i);
                if ( pi % 2 == 0){
                System.out.println("i" + " = " + i + " res" + " = " + pi);
            }
        }
    }
}
/*   Вывести на экран все числа от 0 до 100 для которых выполняется условие сумма
числа и его квадратного корня является четным числом.
        Результат:
        i = 0 res = 0.0
        i = 1 res = 2.0
        i = 4 res = 6.0
        i = 9 res = 12.0
        i = 16 res = 20.0
        i = 25 res = 30.0
        i = 36 res = 42.0
        i = 49 res = 56.0
        i = 64 res = 72.0
        i = 81 res = 90.0
        i = 100 res = 110.0*/
