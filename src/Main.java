import java.time.LocalDate;

public class Main {
    //Задание 1
    public static void determineAndPrintLeapYear(int selectedYear) {
        if (selectedYear % 4 == 0 && selectedYear % 100 != 0 || selectedYear % 400 == 0) {
            System.out.println(selectedYear + " год является високосным");
        } else {
            System.out.println(selectedYear + " год не является високосным");
        }
    }

    public static void task1() {
        int year = 2021;
        determineAndPrintLeapYear(year);
    }

    //Задание 2
    public static void selectAndPrintAppVersion(int opSys, int device) {
        int currentYear = LocalDate.now().getYear();
        String deviceName = opSys == 1 ? "Android" : "iOS";
        String version = device < currentYear ? "облегченную" : "";
        System.out.printf("Установите %s версию приложения для %s", version, deviceName);
    }

    public static void task2() {
        int clientOS = 0;
        int deviceYear = 2021;
        selectAndPrintAppVersion(clientOS, deviceYear);
    }

    //Задание 3
    public static int calculateDeliveryDays(int distance) {
        int deliveryDays = 0;
        int interval = 40;
        int startInterval = 20;
        if (distance <= startInterval) {
            deliveryDays = 1;
        } else {
            deliveryDays = deliveryDays + (int) Math.ceil((distance - startInterval) / (double) interval);
        }
        return deliveryDays;
    }

    public static void task3() {
        int deliveryDistance = 95;
        System.out.println("Потребуется дней: " + calculateDeliveryDays(deliveryDistance));
    }

    public static void main(String[] args) {
        task1();
        task2();
        System.out.println();
        task3();
    }
}