package ru.skypro;

public class Main {

    public static void main(String[] args) {
        int p = 0;
        while (p < 10) {
            p++;
            System.out.print(" " + p);
        }
        System.out.print("\n");
        int re = 1;
        int st = 11;
        for (int rest = 0; rest < 10; rest++) {
            st = st - re;
            System.out.print(" " + st);
        }
        System.out.print("\n");
        int friday = 4;
        for (int day = friday; day <= 31; day += 7) {
            System.out.println("Сегодня пятница " + day + "-ое число. " + "Необходимо подготовить отчет.");
        }
        int year = 2022;
        int comet = year - 200;
        int cometForAllYears = year + 100;
        for (int all = cometForAllYears; all > comet; all+=79) {
            if (all % 79 == 0) {
                System.out.println(all);
            }
        }
    }
}
