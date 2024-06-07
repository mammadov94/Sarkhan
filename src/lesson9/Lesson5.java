package lesson9;

import java.util.Scanner;

public class Lesson5 {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        int k = sb.nextInt();
        int result = (k > 99) ? (k <= 999 ? 3 : k) : 2;
        System.out.println("Количество цифр: " + result);
    }
}