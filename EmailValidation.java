package Chapter9Assingment;

import java.util.Scanner;

public class EmailValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your email address: ");
        String email = scanner.nextLine();

        // Validate length
        if (email.length() < 15 || email.length() > 25) {
            System.out.println(email + " is Invalid. Email should be between 15-25 characters long.");
        } else {
            // Validate @ symbol
            if (!email.contains("@")) {
                System.out.println(email + " is Invalid. Email should have an @ symbol.");
            } else {
                // Validate number
                boolean hasNumber = false;
                for (int i = 0; i < email.length(); i++) {
                    if (Character.isDigit(email.charAt(i))) {
                        hasNumber = true;
                        break;
                    }
                }
                if (!hasNumber) {
                    System.out.println(email + " is Invalid. Email should have at least one number.");
                } else {
                    System.out.println(email + " is Valid.");
                }
            }
        }
    }
}
