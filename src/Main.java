import java.awt.*;

public class Main {
    public static void main(String[] args) {
        int age = 55;
        boolean canNotGoToSchool = age >= 2 && age <= 6;
        boolean canGoToSchool = age >= 7 && age <=18;
        boolean canGoToUniversity = age >= 18 && age <=24;
        boolean canGoToWork = age >= 24;
        if (canNotGoToSchool) {
            System.out.println("Отправляйся в детский сад");
        } else {
        if (canGoToSchool) {
            System.out.println("Иди в школу");
        } else {
            if (canGoToUniversity) {
                System.out.println("Ты учишься в универститете");
            } else {
                if (canGoToWork) {
                    System.out.println("Давай работай!!");
                }
            }

        }
        }
    }


}