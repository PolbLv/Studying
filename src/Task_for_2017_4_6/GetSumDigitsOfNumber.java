package Task_for_2017_4_6;

import java.util.ArrayList;


public class GetSumDigitsOfNumber {
    public static void main(String args[]) {

        printFinalResult(8754);
        printFinalResult(45542);
        printFinalResult(54857);
        printFinalResult(11111101);
        System.out.println(getSumОfDigitsOfNumber(getDigitsOfNumber(15454)));

    }

    public static ArrayList<Integer> getDigitsOfNumber(int num) {
        ArrayList<Integer> digits = new ArrayList<>();
        while (num > 0) {
            digits.add(0, num % 10);
            num /= 10;
        }
        return digits;
    }

    public static int getSumОfDigitsOfNumber(ArrayList<Integer> digits) {
        int sum = 0;

        for (int i = 0; i < digits.size(); i++) {
            sum += digits.get(i);
        }
        return sum;
    }

    public static void printFinalResult(int medvid) {

        ArrayList<Integer> vedmedi = getDigitsOfNumber(medvid);
        int ovechka = getSumОfDigitsOfNumber(vedmedi);
        System.out.println(ovechka);
    }
}

/*типа сначала вызывается метод getDigitsOfNumber -
на выходе список, потом этот список
передаешь другому методу который считает сумму всех
елементов и выводит на консоль*/

/*Используя метод getDigitsOfNumber
найти сумму всех цифр для следующих чисел: 8754, 45542, 54857,1111101*/

