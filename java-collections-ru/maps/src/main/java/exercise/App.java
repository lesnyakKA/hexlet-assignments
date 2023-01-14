package exercise;

import java.util.HashMap;
import java.util.Map;
class App {
    public static Map getWordCount(String sentence) {
        Map<String, Integer> data = new HashMap<>();

        if(sentence.length() == 0) {
            return data;
        }

        String[] array = sentence.split(" ");

        for(String item: array) {
            if (data.containsKey(item)) {
                data.put(item, data.get(item) + 1);
            } else {
                data.put(item, 1);
            }
        }
        return data;
    }

    public static String toString(Map<String, Integer> data) {

        if(data.size() == 0) {
            return "{}";
        }

        String result = "{\n";
        for (Map.Entry<String, Integer> text: data.entrySet()) {
            result = result + "  " + text.getKey() + ":" + " " + text.getValue() + "\n";
        }

        result = result + "}";
        return result;
    }
}