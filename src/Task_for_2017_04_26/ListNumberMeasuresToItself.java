package Task_for_2017_04_26;

import java.util.ArrayList;
import java.util.List;

public class ListNumberMeasuresToItself {
    public static void main(String args[]) {

        List<Integer> digits = getDenominatorsOf(30);
        System.out.println(digits);
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



/*1. Создать метод наполняющий список делителями числа на входе, сигнатура должна быть такой
List<Integer> getDenominatorsOf(int number)

то есть подав на вход число 20 метод возвратит список [1,2,4,5,10]
30 - [1,2,3,5,6,10,15]*/


