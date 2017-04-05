package Old;

/**
 * Created by Serhiy on 3/9/17.
 */
public class DoubleToHundred {
    public static void main(String args[]) {
        typeDoubleToHundred(100);
    }

    public static void typeDoubleToHundred(int x) {
        for (int i = 0; i <= x; i++) {
            if (i % 2 != 0) {
                double pi = i / Math.sqrt(i);
                System.out.println("i" + " = " + i + " result" + " = " + pi);
            }
        }
    }
}
/*1. Для нечетных числе в последовательности 0-100 вывести результат деления
самого числа на его корень (использовать числа с запятой - тип double) */
