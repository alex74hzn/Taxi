package hzn.javalearn.oop.taxi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int carLevel;
        double disttance;
        Taxi taxi;
        carLevel = getUserInt("Для вызова такси, выберите уровень(1 - базовый, 2 - комфорт, 3 - VIP) >");
        taxi = oderTaxi(carLevel);
        disttance = getUserDouble("Введите расстояние поездки >");
        taxi.drive(disttance);
        String result = taxi.deliver();
        System.out.println(result);
        System.out.println(taxi.message);
        System.out.printf("К оплате %4.2f",taxi.getTotal());

    }
    public static Taxi oderTaxi(int level){
        Taxi taxi;
        switch (level){
            case 1:
                taxi = new BasicTaxi();
                break;
            case 2:
                taxi = new ComfortTaxi();
                break;
            case 3:
                taxi = new VipTaxi();
                break;
            default:
                taxi = new BasicTaxi();
                break;
        }
        return taxi;
    }

    public static int getUserInt(String message) {
        int input;
        Scanner sc = new Scanner(System.in);

        System.out.print(message);
        while (!sc.hasNextInt()) {
            sc.nextLine();
            System.out.print(message);
        }
        input = sc.nextInt();

        return input;
    }
    public static double getUserDouble(String message) {
        double input;
        Scanner sc = new Scanner(System.in);

        System.out.print(message);
        while (!sc.hasNextDouble()) {
            sc.nextLine();
            System.out.print(message);
        }
        input = sc.nextDouble();

        return input;
    }
}