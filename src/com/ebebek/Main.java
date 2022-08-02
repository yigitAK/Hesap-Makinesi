package com.ebebek;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("*** Hesap Makinesi ***\n");

        int number1, number2, operation;

        Scanner input = new Scanner(System.in);

        System.out.println("İki tamsayı giriniz: ");

        System.out.print("Sayı 1: ");
        number1 = input.nextInt();

        System.out.print("Sayı 2: ");
        number2 = input.nextInt();

        System.out.println("\nToplama (1)");
        System.out.println("Çıkarma (2)");
        System.out.println("Çarpma (3)");
        System.out.println("Bölme (4)");

        System.out.print("Yapmak istediğiniz işlem için uygun sayıyı giriniz: ");
        operation = input.nextInt();

        switch (operation){
            case 1:
                System.out.println("\nİşlem sonucu: "+number1+" + "+number2+" = "+(number1+number2));
                break;
            case 2:
                System.out.println("\nİşlem sonucu: "+number1+" - "+number2+" = "+(number1-number2));
                break;
            case 3:
                System.out.println("\nİşlem sonucu: "+number1+" * "+number2+" = "+(number1*number2));
                break;
            case 4:
                System.out.println("\nİşlem sonucu: "+number1+" / "+number2+" = "+(number1/number2));
                break;
        }

    }
}
