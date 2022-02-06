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
    }
}
