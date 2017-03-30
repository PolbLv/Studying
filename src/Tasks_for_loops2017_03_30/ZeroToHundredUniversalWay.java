package Tasks_for_loops2017_03_30;

/**
 * Created by LVIVSOFT\spolyakov on 30.03.17.
 */
public class ZeroToHundredUniversalWay {
    public static void main (String arg[]){
        ZeroToHundred(0, 100);
    }

    public static void ZeroToHundred(int min, int max){
        for (int i = min; i <= max; i++){
            System.out.println("ZeroToHundred " + i);
        }
    }
}
