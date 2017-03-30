package Old;

/**
 * Created by Serhiy on 3/15/17.
 */
public class Ninemarchsixthtask {
    public static void main(String args[]) {
        zerotohundred(100);
    }

    public static void zerotohundred(int x) {
        int counter = 0;
        int i = 0;
        while (counter <= x) {
            double pi = i + Math.sqrt(i);
            if (pi % 2 == 0) {
                System.out.println("i  = " + i + " sqrt =  " + counter + " res = " + pi);
                counter++;
            }
            i++;
        }
    }
}

/*Та же задача , что и в №5 только надо вывести 100 таких чисел не зная верхней границы от 0:

результат:

i = 0 sqrt = 0.0 res = 0.0
i = 1 sqrt = 1.0 res = 2.0
i = 4 sqrt = 2.0 res = 6.0
i = 9 sqrt = 3.0 res = 12.0
i = 16 sqrt = 4.0 res = 20.0
i = 25 sqrt = 5.0 res = 30.0
i = 36 sqrt = 6.0 res = 42.0
i = 49 sqrt = 7.0 res = 56.0
i = 64 sqrt = 8.0 res = 72.0
i = 81 sqrt = 9.0 res = 90.0
i = 100 sqrt = 10.0 res = 110.0
i = 121 sqrt = 11.0 res = 132.0
i = 144 sqrt = 12.0 res = 156.0
i = 169 sqrt = 13.0 res = 182.0
i = 196 sqrt = 14.0 res = 210.0
i = 225 sqrt = 15.0 res = 240.0
i = 256 sqrt = 16.0 res = 272.0
i = 289 sqrt = 17.0 res = 306.0
i = 324 sqrt = 18.0 res = 342.0
i = 361 sqrt = 19.0 res = 380.0
i = 400 sqrt = 20.0 res = 420.0
i = 441 sqrt = 21.0 res = 462.0
i = 484 sqrt = 22.0 res = 506.0
i = 529 sqrt = 23.0 res = 552.0
i = 576 sqrt = 24.0 res = 600.0
i = 625 sqrt = 25.0 res = 650.0
i = 676 sqrt = 26.0 res = 702.0
i = 729 sqrt = 27.0 res = 756.0
i = 784 sqrt = 28.0 res = 812.0
i = 841 sqrt = 29.0 res = 870.0
i = 900 sqrt = 30.0 res = 930.0
i = 961 sqrt = 31.0 res = 992.0
i = 1024 sqrt = 32.0 res = 1056.0
i = 1089 sqrt = 33.0 res = 1122.0
i = 1156 sqrt = 34.0 res = 1190.0
i = 1225 sqrt = 35.0 res = 1260.0
i = 1296 sqrt = 36.0 res = 1332.0
i = 1369 sqrt = 37.0 res = 1406.0
i = 1444 sqrt = 38.0 res = 1482.0
i = 1521 sqrt = 39.0 res = 1560.0
i = 1600 sqrt = 40.0 res = 1640.0
i = 1681 sqrt = 41.0 res = 1722.0
i = 1764 sqrt = 42.0 res = 1806.0
i = 1849 sqrt = 43.0 res = 1892.0
i = 1936 sqrt = 44.0 res = 1980.0
i = 2025 sqrt = 45.0 res = 2070.0
i = 2116 sqrt = 46.0 res = 2162.0
i = 2209 sqrt = 47.0 res = 2256.0
i = 2304 sqrt = 48.0 res = 2352.0
i = 2401 sqrt = 49.0 res = 2450.0
i = 2500 sqrt = 50.0 res = 2550.0
i = 2601 sqrt = 51.0 res = 2652.0
i = 2704 sqrt = 52.0 res = 2756.0
i = 2809 sqrt = 53.0 res = 2862.0
i = 2916 sqrt = 54.0 res = 2970.0
i = 3025 sqrt = 55.0 res = 3080.0
i = 3136 sqrt = 56.0 res = 3192.0
i = 3249 sqrt = 57.0 res = 3306.0
i = 3364 sqrt = 58.0 res = 3422.0
i = 3481 sqrt = 59.0 res = 3540.0
i = 3600 sqrt = 60.0 res = 3660.0
i = 3721 sqrt = 61.0 res = 3782.0
i = 3844 sqrt = 62.0 res = 3906.0
i = 3969 sqrt = 63.0 res = 4032.0
i = 4096 sqrt = 64.0 res = 4160.0
i = 4225 sqrt = 65.0 res = 4290.0
i = 4356 sqrt = 66.0 res = 4422.0
i = 4489 sqrt = 67.0 res = 4556.0
i = 4624 sqrt = 68.0 res = 4692.0
i = 4761 sqrt = 69.0 res = 4830.0
i = 4900 sqrt = 70.0 res = 4970.0
i = 5041 sqrt = 71.0 res = 5112.0
i = 5184 sqrt = 72.0 res = 5256.0
i = 5329 sqrt = 73.0 res = 5402.0
i = 5476 sqrt = 74.0 res = 5550.0
i = 5625 sqrt = 75.0 res = 5700.0
i = 5776 sqrt = 76.0 res = 5852.0
i = 5929 sqrt = 77.0 res = 6006.0
i = 6084 sqrt = 78.0 res = 6162.0
i = 6241 sqrt = 79.0 res = 6320.0
i = 6400 sqrt = 80.0 res = 6480.0
i = 6561 sqrt = 81.0 res = 6642.0
i = 6724 sqrt = 82.0 res = 6806.0
i = 6889 sqrt = 83.0 res = 6972.0
i = 7056 sqrt = 84.0 res = 7140.0
i = 7225 sqrt = 85.0 res = 7310.0
i = 7396 sqrt = 86.0 res = 7482.0
i = 7569 sqrt = 87.0 res = 7656.0
i = 7744 sqrt = 88.0 res = 7832.0
i = 7921 sqrt = 89.0 res = 8010.0
i = 8100 sqrt = 90.0 res = 8190.0
i = 8281 sqrt = 91.0 res = 8372.0
i = 8464 sqrt = 92.0 res = 8556.0
i = 8649 sqrt = 93.0 res = 8742.0
i = 8836 sqrt = 94.0 res = 8930.0
i = 9025 sqrt = 95.0 res = 9120.0
i = 9216 sqrt = 96.0 res = 9312.0
i = 9409 sqrt = 97.0 res = 9506.0
i = 9604 sqrt = 98.0 res = 9702.0
i = 9801 sqrt = 99.0 res = 9900.0
i = 10000 sqrt = 100.0 res = 10100.0*/
