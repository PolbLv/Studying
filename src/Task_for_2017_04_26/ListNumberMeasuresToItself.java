package Task_for_2017_04_26;

import java.util.ArrayList;

public class ListNumberMeasuresToItself {
    public static void main(String args[]) {
        getDenominatorsOf(30);
        //for (int i = 0; i < myList.size(); i++) {

                //System.out.println(myList);
        }
    //}


    public static ArrayList<Integer> getDenominatorsOf(int number) {
        ArrayList<Integer> digits = new ArrayList<>();
       // for (int i = 0; i < digits.size(); i++) {
         //   digits.add(i++);
             System.out.println(number);
        //}
        return digits;
    }

    public static String method(int n) {
        String res = " ";
        for (int i = 1; i < n; i++) {
            if (0 == (n % i)) {
                res += i + " ";
            }
        }
        return res;
    }
}
/*1. Создать метод наполняющий список делителями числа на входе, сигнатура должна быть такой
List<Integer> getDenominatorsOf(int number)

то есть подав на вход число 20 метод возвратит список [1,2,4,5,10]
30 - [1,2,3,5,6,10,15]*/

