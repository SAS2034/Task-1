
/* Написать java класс. который содержит массив чисел от 1 до 100,
 перебирает их и в зависимости от выполнения условий выполяет следующее:
а. Если число делится на 3 - вывдит в консоль Fizz
б. Если число делится на 5 - выводит в консоль Buzz
в. Если число делится и на 3, и на 5 - FizzBuzz
г. Иначе, просто выводит число */


public class Main {
    public static void main(String[] args) {
            // Вариант 1
        int N = 100;
        for (int i = 1; i <= N; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FizzBuzz" + " ");
            }
            else if (i % 3 == 0) {
                System.out.print("Fizz"  + " ");
            }
            else if (i % 5 == 0) {
                System.out.print("Buzz"  + " ");
            }
            else { System.out.print(i + " ");
            }
        }
    }
}