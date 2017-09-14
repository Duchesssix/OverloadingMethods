package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int option = 0;
        String business = null, name = null, phone = null;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("1. Business Customer");
            System.out.println("2. Residential Customer");
            System.out.println("3. Exit");

            option = input.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Please enter business name:");
                    business = input.next();
                    System.out.println("Please enter contact name:");
                    name = input.next();
                    System.out.println("Please enter phone number (###) ###-####:");
                    phone = input.next();
                    showInfo(business, name, phone);
                    break;
                case 2:
                    System.out.println("Please enter contact name:");
                    name = input.next();
                    System.out.println("Please enter phone number (###) ###-####:");
                    phone = input.next();
                    showInfo(name, phone);
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Invalid option, please try again");
            }
        } while (option < 1 || option > 3);
    }


    public static void showInfo(String business, String name, String phone) {
        System.out.println("Business name: " + business);
        System.out.println("Contact name: " + name);
        System.out.println("Phone Number: " + phone);
    }

    public static void showInfo(String name, String phone) {
        System.out.println("Contact name: " + name);
        System.out.println("Phone Number: " + phone);
    }
}
