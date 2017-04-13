package Tasks_for_2017_04_12;

import java.util.ArrayList;


public class FourthDigitsFirstDigitsMoreThanSumThreeOthers {
    public static void main (String args []){
        int counter = 0;
        int sum = 0;
        for (int i = 1000; i < 10000; i++){
            sum = getDigitsOfNumber(i).get(1) + getDigitsOfNumber(i).get(2) + getDigitsOfNumber(i).get(3);
            if (getDigitsOfNumber(i).get(0) > sum){
               // System.out.println(i);
                counter++;
            }

        }
        System.out.println(counter);

    }
    public static ArrayList<Integer> getDigitsOfNumber(int num) {
        ArrayList<Integer> digits = new ArrayList<>();
        while (num > 0) {
            digits.add(0, num % 10);
            num /= 10;
        }
        return digits;
    }
}



/*Посчитать количество четырехзначных чисел у которых
первая цифра больше суммы остальных трех цифр*/