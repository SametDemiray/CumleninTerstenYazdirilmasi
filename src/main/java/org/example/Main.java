package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String a;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cümleyi Giriniz : ");
        a = scanner.nextLine();

        String reverse = new StringBuffer(a).reverse().toString();
        System.out.println("\nCümlenin tersten yazılımı : ");

        for (int i = a.length() - 1; i >= 0; i--)
            System.out.print(a.charAt(i));

    }
}
