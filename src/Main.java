/*7). Дано трехзначное число. Определить, какая из его цифр больше:

а) первая или последняя;

б) первая или вторая;

в) вторая или последняя.*/

import java.util.Scanner;

import static java.lang.System.*;

public class Main {

    public static void main(String... args) {
        int num = 0;
        int n = 1;
        int diget;
        int x, y, i;
        int[] array;
        int j = 0;


        System.out.println();
        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        for (i = 1; true; i++) {
            if (num / (int) Math.pow(10, i) > 0) {
                ++n;
            } else break;
        }
        System.out.println("количесто цифр  в числе = " + n);


        array = new int[n];
        for (i = n, j = 0; i > 0; --i, j++) {

            if (i == n) {
                array[j] = num / (int) Math.pow(10, (i - 1));
            } else {
                array[j] = num / (int) Math.pow(10, (i - 1)) % 10;
            }
            System.out.println(array[j] + " ");

        }


    }


    }



