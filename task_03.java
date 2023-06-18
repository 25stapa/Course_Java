// В консоли запросить имя пользователя. 
// В зависимости от текущего времени, вывести приветствие вида:
// "Доброе утро, <Имя>!", если время от 05:00 до 11:59
// "Добрый день, <Имя>!", если время от 12:00 до 17:59;
// "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
// "Доброй ночи, <Имя>!", если время от 23:00 до 4:59

import java.time.LocalTime;
import java.util.Scanner;

public class task_03 {
    public static void main(String[] args) {
        
        LocalTime time = LocalTime.now();
        try (Scanner iScanner = new Scanner(System.in)) {
            System.out.print("Enter your Name: ");
            String name = iScanner.nextLine();

            if(time.isAfter(LocalTime.of(5,0)) && time.isBefore(LocalTime.of(11,59)))
                System.out.println("Goog moning," + name + "!");
            else if(time.isAfter(LocalTime.of(12,0)) && time.isBefore(LocalTime.of(17,59)))
                System.out.println("Good afternoon," + name + "!");
            else if(time.isAfter(LocalTime.of(18,0)) && time.isBefore(LocalTime.of(22,59)))
                System.out.println("Good evening," + name + "!");
            else
                System.out.println("Good night," + name + "!");
        }    
        
               
    }
}
