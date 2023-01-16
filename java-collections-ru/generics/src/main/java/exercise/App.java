package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Map.Entry;

class App {

    public static List<Map<String, String>> findWhere(List<Map<String, String>> books, Map<String, String> where) {
        List<Map<String, String>> result = new ArrayList<>();

        for (Map<String, String> item : books) {
            if (item.get("title") == where.get("title") || where.get("title") == null) {
                if (item.get("year") == where.get("year") || where.get("year") == null) {
                    if (item.get("author") == where.get("author") || where.get("author") == null) {
                        result.add(item);
                    }
                }
            }
        }
        return result;
    }
}