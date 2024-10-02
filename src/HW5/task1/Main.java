package HW5.task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();
        words.add("apple");
        words.add("kiwi");
        words.add("banana");
        words.add("cat");
        words.add("dog");
        words.add("elephant");
        words.add("fish");
        words.add("grape");
        words.add("house");
        words.add("ice");
        words.add("java");
        words.add("kite");
        words.add("lemon");
        words.add("mango");
        words.add("nut");

        words.stream()
                .filter(word -> word.length() >= 4)
                .sorted()
                .forEach(System.out::println);
    }
}
