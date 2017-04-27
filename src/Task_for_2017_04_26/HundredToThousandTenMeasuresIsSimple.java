package Task_for_2017_04_26;

import java.util.ArrayList;
import java.util.List;


public class HundredToThousandTenMeasuresIsSimple {
    public static void main (String args []){
        myMethod();
    }

    public static void myMethod() {
        int initialSize = 1000;
        int i = 0;
    List<Integer> myList = new ArrayList<>(initialSize);
        for ( ; i < initialSize; i++){
            myList.add(i);

            System.out.println(myList.get(i));
        }

    }
    public static ArrayList<Integer> getDenominatorsOf(int number) {
        ArrayList<Integer> digits = new ArrayList<>();

        for (int i = 1; i < number; i++) {
            if (0 == (number % i)) {
                digits.add(i);
            }
        }
        return digits;
    }
}
    /*Вывести на экран числа из интервала 100-1000 у которых
    количество делителей больше 10 и количество делителей является простым числом.*/