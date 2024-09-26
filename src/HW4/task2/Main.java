package HW4.task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("kiwi");
        words.add("orange");
        words.add("grape");
        words.add("melon");
        words.add("pear");
        words.add("peach");
        words.add("plum");
        words.add("mango");
        words.add("lemon");
        words.add("lime");
        words.add("cherry");
        words.add("pineapple");
        words.add("blueberry");
        words.add("watermelon");
        words.add("strawberry");

        Collections.sort(words);

        System.out.println(words);
    }
}
