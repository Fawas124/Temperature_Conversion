package sem2;

import java.util.Scanner;

public class Temperature_Conversion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueConversion = true;

        // Main loop for temperature conversion
        while (continueConversion) {
            System.out.println("Temperature Conversion");
            System.out.println("1. Convert Fahrenheit to Celsius");
            System.out.println("2. Convert Celsius to Fahrenheit");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            int choice = getValidChoice(scanner); // Get valid menu choice

            // Exit condition
            if (choice == 3) {
                System.out.println("Exiting...");
                break;
            }

            System.out.print("Enter the temperature value: ");
            double temperature = getValidDouble(scanner); // Get valid temperature input
            double convertedTemperature;

            // Perform conversion based on user choice
            switch (choice) {
                case 1:
                    convertedTemperature = Temperature_Converter.fahrenheitToCelsius(temperature);
                    System.out.printf("Temperature in Celsius: %.2fC\n", convertedTemperature);
                    break;
                case 2:
                    convertedTemperature = Temperature_Converter.celsiusToFahrenheit(temperature);
                    System.out.printf("Temperature in Fahrenheit: %.2fF\n", convertedTemperature);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            
            boolean validResponse = false;
            // Loop to handle continuation choice
            while (!validResponse) {
                System.out.print("Do you want to continue? (yes/no): ");
                String userResponse = scanner.nextLine().toLowerCase();
                if (userResponse.equals("yes")) {
                    validResponse = true;
                } else if (userResponse.equals("no")) {
                    continueConversion = false;
                    validResponse = true;
                } else {
                    System.out.println("Invalid input. Please enter 'yes' or 'no'.");
                }
            }

        }
        
        scanner.close(); // Close scanner
        System.out.println("Program ends");
    }

    // Method to validate and retrieve menu choice
    public static int getValidChoice(Scanner scanner) {
        while (true) {
            try {
                int choice = Integer.parseInt(scanner.nextLine());
                if (choice >= 1 && choice <= 3) {
                    return choice;
                } else {
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
    }

    // Method to validate and retrieve temperature input
    public static double getValidDouble(Scanner scanner) {
        while (true) {
            try {
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid temperature value.");
            }
        }
    }
}
