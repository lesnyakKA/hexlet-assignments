package exercise;

import java.util.ArrayList;
import java.util.List;

class App {
    public static boolean scrabble(String chars, String word) {
        List<Character> scrabbleDate = new ArrayList<>();
        char[] array = chars.toCharArray();
        boolean result = false;

        for (char item: array) {
            scrabbleDate.add(item);
        }

        for (int i = 0; i < word.length(); i++) {
            if (scrabbleDate.contains(word.charAt(i))) {
                continue;
            } else {
                result = false;
            }
            result = true;
        }

        if (scrabbleDate.isEmpty()) {
            result = false;
        }

        return result;
    }
}
