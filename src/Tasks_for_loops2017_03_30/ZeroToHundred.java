package Tasks_for_loops2017_03_30;

/**
 * Created by LVIVSOFT\spolyakov on 30.03.17.
 */
public class ZeroToHundred {
    public static void main(){
        zeroToHundred(100);
        hundredToZero(100);
    }
    public static void zeroToHundred(int x){
        for (int i = 0; i < x; i++);
        System.out.println("ZeroToHundred " + x);
    }
    public static void hundredToZero(int x){
        for (int i = 0; i > x; --i);
        System.out.println("HundredToZero " + x);

    }
}


/*    Написать программу выводящую на экран числа от 0 до 100,
        затем числа от -100 до 0 затем четные числа в диапазоне от 0 до 100,
        затем нечетные числа в диапазоне от -100 до 0*/