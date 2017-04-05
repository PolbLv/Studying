package Tasks_for_2017_03_27;

import java.util.ArrayList;

/**
 * Created by LVIVSOFT\spolyakov on 05.04.17.
 */
public class PopulateListRandomDigitsWithSimpleIndexes {
    public static void main(String args[]) {
        int counter = 0;
        ArrayList<Integer> myList = populateList(13, 500);
        for (int i = 0; i < myList.size(); i++) {
            if (isSimple(myList.get(i))) {
                counter++;
            }
        }
        System.out.println(myList);
        System.out.println(counter);




    }



    public int getArrayIndex(int[] arr,int value) {

        int k=0;
        for(int i=0;i<arr.length;i++){

            if(arr[i]==value){
                k=i;
                break;
            }
        }
        return k;
    }

    public static ArrayList<Integer> populateList( int size, int limit) {
        ArrayList<Integer> myList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            myList.add((int) (Math.random() * (limit + 1)));
        }
        return myList;
    }

    public static boolean isSimple(int num) {
        if (num == 0) {
            return false;
        }
        for (int x = 2; x < num; x++) {
            if (num % x == 0) {
                return false;
            }
        }
        return true;
    }

}


/* Используя метод populateList создать список случайных чисел от 0 до 500,
вывести на экран числа из списка у которых индексы в списке являются простым числом*/