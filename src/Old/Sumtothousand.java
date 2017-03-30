package Old;

/**
 * Created by Serhiy on 2/27/17.
 */
public class Sumtothousand {
    public static void main (String args[]){
        sumtothousand (1000);
    }
    public static void sumtothousand(int x) {
        int sum = 0;
        for (int i = 0; i <= x; i++) {
            if (i % 5 == 0) {
                sum = sum + i;
            }
            System.out.println("sum = " + sum  );
        }
    }
}


/*Подсчитать сумму всех чисел кратных 5 в диапазоне 0-1000
Результат: 100500 !!! :)*/