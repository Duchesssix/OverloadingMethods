package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int option = 0;   //declare option variable to get user selection
        String business = null, name = null, phone = null;  //declare variables for user input
        Scanner input = new Scanner(System.in);  //declare scanner for user input

        do {
           //display selection menu
            System.out.println("1. Business Customer");
            System.out.println("2. Residential Customer");
            System.out.println("3. Exit");

            //get user selection
            option = input.nextInt();

            //determine which prompts to display based on user selection
            switch (option) {
                case 1:  //Business Customer
                    System.out.println("Please enter business name:");
                    business = input.next();
                    System.out.println("Please enter contact name:");
                    name = input.next();
                    System.out.println("Please enter phone number (###) ###-####:");
                    phone = input.next();
                    showInfo(business, name, phone);
                    break;
                case 2:  //Residential Customer
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

    //Methods to display user input based on menu selection
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
