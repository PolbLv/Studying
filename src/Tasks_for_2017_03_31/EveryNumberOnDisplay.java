package Tasks_for_2017_03_31;

/**
 * Created by Serhiy on 4/1/17.
 */
public class EveryNumberOnDisplay {
    public static void main(String args[]) {

        numberOnDisplay(4567);
    }


    public static void numberOnDisplay(int x) {
        int i = 0;
        for (; x < 10; i++) {
            // что-то делаем

            System.out.println("\n" + i);
        }
    }
}

/*Написать метод выводящий число поциферно на экран (каждую цифру на новую строку),
например на вход подается число 4567, метод должен вывести данное число следующим образом
4
5
6
7*/