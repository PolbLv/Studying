package Tasks_for_2017_04_12;

import java.util.ArrayList;

public class SixDigitsNumbersFirstAndLastDigitsIfSumCountDigit {
    public static void main(String args[]){
    for (int i = 0; i < 100000; i++){
        System.out.println(i);

    }

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

