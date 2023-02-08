package exercise;

import java.util.List;

class App {
    public static List<String> buildApartmentsList(List<Home> list, int n) {
        return list.stream()
                .sorted((home1, home2) -> home1.compareTo(home2))
                .map(home -> home.toString())
                .limit(n)
                .toList();
    }
}
