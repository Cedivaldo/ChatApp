package com.mycompany.registrationandlogin1;

import java.util.Scanner;

public class Registrationandlogin1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== REGISTRATION ===");

        // 1. Username
        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        // 2. Password
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        // 3. First name
        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();

        // 4. Last name
        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();

        // 5. Cell phone number
        System.out.print("Enter cell phone number: ");
        String cellNumber = scanner.nextLine();

        // Registration object with NEW order: username, password, firstName, lastName, cellNumber
        Registration registration =
                new Registration(username, password, firstName, lastName, cellNumber);

        // Registration result
        System.out.println(registration.registerUser());

        // Stop if registration failed
        if (!registration.checkUserName()
                || !registration.checkPasswordComplexity()
                || !registration.checkCellPhoneNumber()) {
            scanner.close();
            return;
        }

        // LOGIN
        System.out.println("\n=== LOGIN ===");

        System.out.print("Enter username: ");
        String loginUsername = scanner.nextLine();

        System.out.print("Enter password: ");
        String loginPassword = scanner.nextLine();

        Login login = new Login(loginUsername, loginPassword, registration);
        System.out.println(login.returnLoginStatus());

        scanner.close();
    }
}