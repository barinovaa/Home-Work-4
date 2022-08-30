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
        // Задание 2
        int ageKids = 25;
        boolean forbidden = ageKids <= 5;
        boolean allowedWithAnAdult = ageKids > 5 && ageKids < 14;
        boolean allowed = ageKids > 14;
        if (forbidden) {
            System.out.println("Тебе запрещено на атракцион");
        } else {
            if (allowedWithAnAdult) {
                System.out.println("Только в сопровождении взрослых");
            } else {
                if (allowed)
                    System.out.println("Всегда пожалуйста!!!");
            }
        }
        // Задание 3
        int one = 1;
        int two = 2;
        int free = 3;
        boolean number = one == two;
        boolean number2 = one == free;
        boolean number3 = two < free;
            if (number) {
            System.out.println(one);
        } else {
            if (number2) {
            System.out.println(two);
        } else {
            if (number3)
            System.out.println(free); }

        }
    }


}