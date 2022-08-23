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
        if (device < currentYear) {
            System.out.print("Установите облегченную версию приложения для ");
        } else {
            System.out.print("Установите версию приложения для ");
        }
        if (opSys == 1) {
            System.out.println("Android по ссылке");
        } else {
            System.out.println("iOS по ссылке");
        }
    }

    public static void task2() {
        int clientOS = 0;
        int deviceYear = 2021;
        selectAndPrintAppVersion(clientOS, deviceYear);
    }

    //Задание 3
    public static int calculateDeliveryDays(int Distance) {
        int deliveryDays = 0;
        int interval = 40;
        int startInterval = 20;
        if (Distance <= startInterval) {
            deliveryDays = 1;
        } else {
            deliveryDays = deliveryDays + (int) Math.ceil((Distance - startInterval) / (double) interval);
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
        task3();
    }
}