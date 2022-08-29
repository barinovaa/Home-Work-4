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
        int kidd = 45;
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
        int van = 103;
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
    }


}