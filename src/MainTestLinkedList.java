import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MainTestLinkedList {
    public static void main(String[] args) {
        System.out.println("Напишите капасити Колекции \n");
        Scanner sc = new Scanner(System.in);
        int capacity = sc.nextInt();
        int current = 0;

        LocalTime startTime = LocalTime.now();
        List<String> list = new LinkedList<>();

        while(list.size() < capacity+1){
            list.add("Str" + current);
            current++;
        }
        for (String str : list){
            System.out.println(str);
        }
        LocalTime endTime = LocalTime.now();

        // Вычисление затраченного времени
        Duration timeTaken = Duration.between(startTime, endTime);

        // Преобразование Duration в формат HH:mm:ss
        String formattedTime = String.format("%02d:%02d:%02d.%03d",
                timeTaken.toHours(),
                timeTaken.toMinutesPart(),
                timeTaken.toSecondsPart(),
                timeTaken.toMillisPart());

        System.out.println("Создание списка заняло " + formattedTime + ".");
    }
}
