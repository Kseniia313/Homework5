public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println(" Задача 1 ");
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println(" Установите версию приложения для iOS по ссылке». ");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке. ");
        }
        // Второй вариант решения
        //switch (clientOS){
        //case 0:
        //   System.out.println(" Установите версию приложения для iOS по ссылке». ");
        //   break;
        // case 1:
        //   System.out.println( " Установите версию приложения для Android по ссылке. ");
        //   break;//
    }

    public static void task2() {
        System.out.println(" Задача 2");
        int clientDeviceYear = 2018;
        int clientOS = 1;
        if (clientOS == 1 && clientDeviceYear >=2015) {
            System.out.println(" Установите версию приложения для Android по ссылке ");
        }else if (clientOS ==1 && clientDeviceYear < 2015){
            System.out.println(" Установите облегченную версию для Android ");
        }
        if (clientOS ==0 && clientDeviceYear < 2015){
            System.out.println(" Установите облегченную версию приложения для iOS по ссылке");
        }else if (clientOS ==0 && clientDeviceYear >=2015){
            System.out.println( " Установите версию для iOS ");
        }
    }
    public static void task3(){
        System.out.println(" Задача 3");
        int year = 1876;
        if ((year%4==0) || (year%400==0 )){
            System.out.println( +year+ " високосный год ");
        }else if (year%100!=0){
            System.out.println(+ year+ " невисокосный год ");
        }
        }
        public static void task4(){
            System.out.println(" Задача 4 ");
            int deliveryDistance = 101;
            if (deliveryDistance<20){
                System.out.println( " Потребуется один день для доставки ");
            } else if(deliveryDistance>=20 && deliveryDistance <60){
                System.out.println(" Потребуется 2 дня для доставки ");
            }else if (deliveryDistance>=60&& deliveryDistance <=100){
                System.out.println(" Потребуется 3 дня для доставки ");
            }else {
                System.out.println(" Доставки нет ");
            }
        }
        public static void task5(){
            System.out.println(" Задача 5 ");
            int monthNumber = 4;
            switch (monthNumber) {
             case 12:
                System.out.println(" Зима");
               break;
                case 1:
                    System.out.println("Зима");
                    break;
                case 2:
                    System.out.println("Зима");
                    break;
                case 3:
                    System.out.println("Весна ");
                    break;
                case 4:
                    System.out.println("Весна ");
                    break;
                case 5:
                    System.out.println("Весна ");
                    break;
                case 6:
                    System.out.println("Лето");
                    break;
                case 7:
                    System.out.println("Лето");
                    break;
                case 8:
                    System.out.println("Лето");
                    break;
                case 9:
                    System.out.println("Осень");
                    break;
                case 10:
                    System.out.println("Осень");
                    break;
                case 11:
                    System.out.println("Осень");
                    break;
                default:
                System.out.println( " Нет такого месяца");
            }
                }
        }





