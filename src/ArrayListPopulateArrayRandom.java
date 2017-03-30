import java.util.ArrayList;
import java.util.List;

/**
 * Created by Serhiy on 3/29/17.
 */
public class ArrayListPopulateArrayRandom {
    public static void main(String args[]) {

//    int[] array = populateArray(10, 500);
        populateList(20, 300);


    }

    public static ArrayList<Integer> populateList(int size, int limit) {
        ArrayList<Integer> random = new ArrayList<>(100);


        for (int i = 0; i < 10; i++) {
            random.add((int) (Math.random() * (limit + 1)));

            // System.out.println(random);
        }
        System.out.println(random);
        return random;
    }

}

/*Создать метод с сигнатурой public static List<Integer>
populateList(int size, int limit) который будет наполнять список случайными числами,
схема действия такая же как и в методе
    populateArray  (из прошлых задач) только вместо массива используется список.*/

/*void myMethod(){
        //some copy-pasted code
        //Sysout(some value from code);*/