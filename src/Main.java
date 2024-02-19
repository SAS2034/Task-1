
/* Написать java класс. который содержит массив чисел от 1 до 100,
 перебирает их и в зависимости от выполнения условий выполяет следующее:
а. Если число делится на 3 - вывдит в консоль Fizz
б. Если число делится на 5 - выводит в консоль Buzz
в. Если число делится и на 3, и на 5 - FizzBuzz
г. Иначе, просто выводит число */

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    int[] array = new int[100];
    for (int i = 0; i < array.length; i++) {
        array[i] = (int)(Math.random() * 100);
    }
      System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (i % 3 == 0) {
                System.out.print( " Fizz");
            }
            if (i % 5 == 0) {
                System.out.print(" Buzz");
            }
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(" FizzBuzz ");
            } else
                System.out.print(" "+ array[i]);
        }
    }
}