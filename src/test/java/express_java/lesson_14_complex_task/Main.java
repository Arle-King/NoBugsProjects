package express_java.lesson_14_complex_task;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static public String prof(List<String> arr) {

        String str = "";

        str += arr.getFirst().substring(0, 1).toUpperCase() + arr.getFirst().substring(1) + " ";

        for (int i = 1; i < arr.size() - 1; i++) {
            str += arr.get(i) + " ";
        }

        str += arr.getLast() + ".";

        return str;
    }

    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>(List.of("мама", "мыла", "раму"));

        System.out.println(prof(arr));

    }
}
