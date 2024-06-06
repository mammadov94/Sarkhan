package lesson9;

import java.util.Scanner;

public class Lesson4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a <= 99) {
            System.out.println("Количество цифр: 2");
        } else if (a <= 999) {
            System.out.println("Количество цифр: 3");
        } else if (a <= 9999) {
            System.out.println("Количество цифр: 4");
        } else if (a <= 99999) {
            System.out.println("Количество цифр: 5");
        } else if (a <= 999999) {
            System.out.println("Количество цифр: 6");
        } else if (a <= 9999999) {
            System.out.println("Количество цифр: 7");
        } else {
            System.out.println("Вы ввели большое количество цифр");
        }
    }
}
