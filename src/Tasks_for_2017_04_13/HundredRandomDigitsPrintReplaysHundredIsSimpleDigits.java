package Tasks_for_2017_04_13;


import java.util.ArrayList;
import java.util.List;

public class HundredRandomDigitsPrintReplaysHundredIsSimpleDigits {
    public static void main(String args[]) {
        List<Integer> myList = populateList(1000, 1000);
        int counter = 0;
        for (int i = 0; i < myList.size(); i++) {
            if (isSimple(i)) {
                counter++;
                System.out.println("number " + counter + " i =  " + i );
            }
            if (counter == 100) {
                break;
            }
        }
        System.out.println(" result = " +  counter);
    }

    public static List<Integer> populateList(int size, int limit) {
        List<Integer> random = new ArrayList<>();

        for (int i = 0; i < size; i++) {

            random.add((int) (Math.random() * (limit + 1)));
        }
        System.out.println(random);
        return random;
    }

    public static boolean isSimple(int num) {
        if (num == 0 || num == 1) {
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

/*
7,Написать программу которая генерирует случайные числа от 0 до 100,
вывести на экран количество повторений этой программы необходимых
для генерациии сотни простых чисел. */
