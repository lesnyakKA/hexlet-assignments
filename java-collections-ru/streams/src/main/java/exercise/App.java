package exercise;

import java.util.List;
class App {
    public static long getCountOfFreeEmails(List<String> emails) {
        return emails.stream()
                .filter(email -> email.contains("@yandex.ru") || email.contains("@hotmail.com") || email.contains("@gmail.com"))
                .count();
    }
}
