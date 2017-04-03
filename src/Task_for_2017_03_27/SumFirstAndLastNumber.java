package Task_for_2017_03_27;

/**
 * Created by LVIVSOFT\spolyakov on 03.04.17.
 */
public class SumFirstAndLastNumber {
    public static void main(String args []){

        sumNumbers(1775);
    }
    public static int sumNumbers(int x){
        int sum = 0;
        int f = x % 10;
        while (x > 10)
            x = x /10;
        int l = x/10;
            sum = f + l;
        System.out.println(sum);
          return f + l;
    }
}


/**/