import java.util.HashMap;
import java.util.Map;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // Creating a HashMap
        Map<String, Integer> studentScores = new HashMap<>();
        studentScores.put("Alice", 12);
        studentScores.put("Bob", 15);
        studentScores.put("Bob", 115);
        studentScores.put("Charlie", 14);
        studentScores.put("David", 20);

        System.out.println(studentScores);
    }
}