package Task_for_2017_04_26;

import java.util.ArrayList;

public class FiftyDigitsWithMaxMeasuresVarOne {
    public static void main(String args[]) {
        myMethod(100, 1000);
    }

    public static void myMethod(int x, int y) {
        ArrayList<Integer> digits;
        ArrayList<ArrayList<Integer>> myList = new ArrayList<>();
        for (int i = x; i < y; i++) {
            digits = getDenominatorsOf(i);
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(i);
            temp.add(digits.size());
            myList.add(temp);
        }

        for (int i = 0; i < myList.size() - 1; i++) {
            for (int j = i + 1; j < myList.size(); j++) {
                if (myList.get(i).get(1) < myList.get(j).get(1)) {
                    myList.add(i, myList.get(j));
                    myList.remove(j+1);
                }
            }
        }
        for(int i = 0; i < 50; i++ ){
            System.out.println(myList.get(i).get(0));
        }
        System.out.println( "  = " + myList);
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


/*Вывести на экран 50 чисел из интервала 100-1000
    у которых наибольшее количество делителей.*/