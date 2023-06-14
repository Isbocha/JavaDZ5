package ru.netology.services;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        PlannerService service = new PlannerService();
        int result = service.calculate(10_000, 3_000, 20_000);
        System.out.println("В этом году Вам удастся отдохнуть в течение : " + result + " месяца/-ев");
    }
}