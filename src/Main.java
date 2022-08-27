public class Main {
    public static void main(String[] args)
    {
        //Задание 1
        int year = 2000;
        determineYear(year);

        //Задание 2
        String name = "iOS";
        String name1 = "Android";
        int clientDeviceYear = 2015;
        getClientOS(name, clientDeviceYear);

        //Задание 3
        int deliveryDistance = 95;
        System.out.println("Потребуется дней: " + calculateTheNumberOfDays(deliveryDistance));
    }

    //Задание 1
    private static void determineYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - не високосный год");
        }
    }

    //Задание 2
    private static void getClientOS(String name, int clientDeviceYear) {
        int currentYear = 2022;
        if (name.equals("iOS") && clientDeviceYear >= currentYear) {
            System.out.println("Установите обычную версию приложения для iOS по ссылке");
        }
        if (name.equals("Android") && clientDeviceYear >= currentYear) {
            System.out.println("Установите обычную версию приложения для Android по ссылке");
        }
        if (name.equals("iOS") && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (name.equals("Android") && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    //Задание 3
    private static int calculateTheNumberOfDays(int deliveryDistance) {
        int theNumberOfDays = 0;
        if (deliveryDistance <= 20) {
            theNumberOfDays = 1;
        }
        if (deliveryDistance > 20 && deliveryDistance <= 60) {
            theNumberOfDays = 2;
        }
        if (deliveryDistance > 60 && deliveryDistance <= 100) {
            theNumberOfDays = 3;
        }
        return theNumberOfDays;
    }
}
