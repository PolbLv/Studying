package Old;

import java.util.Random;

/**
 * Created by Serhiy on 2/25/17.
 */
public class Zerotohundred {
public static void main(String args[]) {
        sumXtoY(- 100);
        }

    public static void sumXtoY(int x){
        for(int i=100;i>=x;i--){
        System.out.println(i);
        }
    }
}

/*public class Old.Zerotohundred 1 {
    public static void main(String args[]) {
        printRange(-100,100);
    }

    public static void printRange(int low, int high){
        for (int i= high; i>= low;i--){
            System.out.println(i);
        }
    }
}*/ //В этом случае метод не содержит захардкодженых переменных




//Вывести на консоль все числа от 100 до -100