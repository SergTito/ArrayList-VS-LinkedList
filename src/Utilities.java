import java.time.LocalTime;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Utilities {
    public static void main(String[] args) {


        System.out.println("Введите вместимость коллекции:");
        Scanner sc = new Scanner(System.in);
        int capacity = sc.nextInt();
        int current = 0;

        LocalTime startTime = LocalTime.now();
        List<String> list = new LinkedList<>();

        while (list.size() < capacity) { // Заменяем на правильное условие
            list.add("Str" + current);
            current++;
        }

        for (String str : list) {
            System.out.println(str);
        }

    }
}