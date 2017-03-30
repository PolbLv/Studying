package Old;

/**
 * Created by LVIVSOFT\spolyakov on 22.03.17.
 */
public class PopulateArraycountdigits {
    public static void main(String[] args) {
        int[] array = populateArray(10, 500);
        countArray(array);
    }


    public static int[] populateArray(int size, int maxRandomNumber) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * (maxRandomNumber + 1));
 //          System.out.println(array[i]);
        }
        return array;
    }

    public static void countArray(int[] array ) {
        int counter= 0;
        for (int i = 0; i <array.length; i++) {
            if (array[i] % 2 ==0)
                counter++;
        }
        System.out.println(counter);
    }
}
//Используя метод populateArray создать массив чисел от 0 до 500, вывести на экран количество четных чисел в массиве

/*1) метод мэйн, точка входа в твою программу, из этого метода ты вызываешь оба других метода
        2) метод populateArray из прошлых задач
        3) и твой метод принимающий , массив и считающий , чё там надо по условию задачи*/