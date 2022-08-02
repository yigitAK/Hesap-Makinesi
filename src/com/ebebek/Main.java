package com.ebebek;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int number1, number2, operation;

        Scanner input = new Scanner(System.in);

        System.out.println("İki tamsayı giriniz: ");

        System.out.println("Sayı 1: ");
        number1 = input.nextInt();

        System.out.println("Sayı 2: ");
        number2 = input.nextInt();

        System.out.println("\nToplama (1)");
        System.out.println("Çıkarma (2)");

        System.out.println("Yapmak istediğiniz işlem için uygun sayıyı giriniz:");
        operation = input.nextInt();

        switch (operation){
            case 1:
                System.out.println(number1+number2);

            case 2:
                System.out.println(number1-number2);
        }

    }
}
