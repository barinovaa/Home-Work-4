import java.awt.*;

public class Main {
    public static void main(String[] args) {
        int agg = 17;
        if (agg >= 18) {
            System.out.println("Поздравление пользователя с совершеннолетием");
        } else {
            System.out.println("Совершеннолетия ещё не наступил");
        }
        // Задание 2
        int kidd = 23;
        if (kidd <=7) {
            System.out.println("Ребенок ходит в Школу");
        }
        if (kidd >=18)
        if (kidd <=23) {
            System.out.println("Отправляться в университет");
        }
        if (kidd >=24) {
            System.out.println("Пора искать первую работу");
        }
        // Задание 3
        int van = 55;
        if (van <= 59){
            System.out.println("Остались сидячии и стоячии места");
        }
        if (van >=60)
        if (van <=102) {
            System.out.println("Остались только стоячие места");
        }
        if (van >=103) {
            System.out.println("Месть нет");
        }
        // Условный оператор
        int year = 5;
        if (year <=17) {
            System.out.println("Возраст совершеннолетия ещё не наступил");
        } else {
            System.out.println("Поздравление пользователя с совершеннолетием");
        }
        // Задание 2
        int kids = 25;
        if (kids <=7) {
            System.out.println("Ребенок ходит в Школу");
        }
        if (kids >=18)
            if (kids <=23) {
                System.out.println("Отправляться в университет");
            } else {
            System.out.println("Пора искать первую работу");
        }
        // Задание 3
        int vane = 59;
        if (vane <= 59) {
            System.out.println("Остались сидячии и стоячии места");
        }
        if (vane >=60 && vane <=102) {
                System.out.println("Остались только стоячие места");
            } else {
            System.out.println("Месть нет");
        }
    }


}