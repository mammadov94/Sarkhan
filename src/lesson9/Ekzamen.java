package lesson9;

import java.nio.channels.ScatteringByteChannel;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Ekzamen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any integer");
        int a = sc.nextInt();
        int i = 0;
        while (a != 0) {
            a /= 10;
            i++;
        }
        System.out.println("NUmber of digits: " + i);
    }
}