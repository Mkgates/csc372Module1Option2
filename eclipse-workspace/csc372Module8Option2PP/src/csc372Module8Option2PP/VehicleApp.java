package csc372Module8Option2PP;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class VehicleApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		LinkedList<Vehicle> vehicles = new LinkedList<>();
		
		String continueInput;
		do {
			System.out.print("Enter vehicle make: ");
			String make = scanner.nextLine();
			
			System.out.print("Enter vehicle model: ");
			String model = scanner.nextLine();
			
			double mpg = 0.0;
			boolean validInput = false;
			while (!validInput) {
				System.out.print("Enter miles per gallon: ");
				try {
					mpg = Double.parseDouble(scanner.nextLine());
					if (mpg <= 0) {
						System.out.println("MPG must be greater than 0.");
					} else {
						validInput = true;
					}
				} catch (NumberFormatException e) {
					System.out.println("Invalid number. {Please enter a valid decimal number for MPG.");
				}
			}
			vehicles.add(new Vehicle(make, model, mpg));

            System.out.print("Add another vehicle? (yes/no): ");
            continueInput = scanner.nextLine().trim().toLowerCase();
        } while (continueInput.equals("yes"));

        // Sort vehicles by MPG ascending
        Collections.sort(vehicles, Comparator.comparingDouble(Vehicle::getMpg));

        // Write to file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("vehicles.txt"))) {
            for (Vehicle v : vehicles) {
                writer.write(v.toString());
                writer.newLine();
            }
            System.out.println("Vehicle data saved to vehicles.txt");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        scanner.close();
    }
}
