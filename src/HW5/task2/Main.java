package HW5.task2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] numbers = {5, 15, 30, 8, 45, 60, 20, 9, 12, 3, 25, 10, 16, 6, 4, 18, 7, 90, 21, 33};

        System.out.println("Відсортований масив:");
        Arrays.stream(numbers)
                .sorted()
                .forEach(System.out::println);

//        тут можна було також отримати змінений масив для подальшої обробки вже відсортованим:
//        int[] sortedNumbers = Arrays.stream(numbers)
//                .sorted()
//                .toArray();
//        Але я вирішив просто виводити результати


        System.out.println("Числа, кратні 3:");
        Arrays.stream(numbers)
                .filter(num -> num % 3 == 0)
                .forEach(System.out::println);

        System.out.println("Числа, кратні 10:");
        Arrays.stream(numbers)
                .filter(num -> num % 10 == 0)
                .forEach(System.out::println);

        System.out.println("Перебір масиву за допомогою forEach():");
        Arrays.stream(numbers)
                .forEach(System.out::println);

        System.out.println("Масив, де всі значення у 3 рази більші:");
        Arrays.stream(numbers)
                .map(num -> num * 3)
                .forEach(System.out::println);
    }
}


