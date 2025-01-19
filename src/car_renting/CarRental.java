package car_renting;

import java.util.Scanner;

public class CarRental {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RentalService rentalService = new RentalService();

        while (true) {
            System.out.println("\n!!!  WELCOME TO CAR RENTAL SYSTEM  !!! \n");
            System.out.println("1. Add a Car");
            System.out.println("2. View Available Cars");
            System.out.println("3. Rent a Car");
            System.out.println("4. Return a Car");
            System.out.println("5. Pre-Book a Car");
            System.out.println("6. Calculate Rental Cost");
            System.out.println("7. View Customer Details");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Car ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Model: ");
                    String model = scanner.nextLine();

                    System.out.print("Enter Car Name: ");
                    String type = scanner.nextLine();

                    System.out.print("Enter Registration Number: ");
                    String regNumber = scanner.nextLine();

                    System.out.print("Enter Rental Price: ");
                    double price = scanner.nextDouble();
                    rentalService.addCar(new Car(id, model, type, regNumber, price, true));
                    break;

                case 2:
                    rentalService.viewAvailableCars();
                    break;

                case 3:
                    System.out.print("Enter Car ID to Rent: ");
                    int rentId = scanner.nextInt();
                    scanner.nextLine(); 

                    System.out.print("Enter Customer Name: ");
                    String rentCustomerName = scanner.nextLine();

                    System.out.print("Enter Start Date (YYYY-MM-DD): ");
                    String startDate = scanner.nextLine();

                    System.out.print("Enter End Date (YYYY-MM-DD): ");
                    String endDate = scanner.nextLine();

                    rentalService.rentCar(rentId, rentCustomerName, startDate, endDate);
                    break;

                case 4:
                    System.out.print("Enter Car ID to Return: ");
                    int returnId = scanner.nextInt();
                    rentalService.returnCar(returnId);
                    break;

                case 5:
                    System.out.print("Enter Car ID to Pre-Book: ");
                    int preBookId = scanner.nextInt();
                    scanner.nextLine(); 

                    System.out.print("Enter Customer Name: ");
                    String customerName = scanner.nextLine();

                    System.out.print("Enter Start Date (YYYY-MM-DD): ");
                    String startDate1 = scanner.nextLine();

                    System.out.print("Enter End Date (YYYY-MM-DD): ");
                    String endDate1 = scanner.nextLine(); 

                    rentalService.preBookCar(preBookId, customerName, startDate1, endDate1); 
                    break;

                case 6:
                    System.out.print("Enter Car ID: ");
                    int calcCarId = scanner.nextInt();

                    System.out.print("Enter Rental Duration (in days): ");
                    int duration = scanner.nextInt();

                    rentalService.calculateRentalCost(calcCarId, duration);
                    break;

                case 7:
                    System.out.print("Enter Car ID to View Customer Details: ");
                    int viewId = scanner.nextInt();
                    rentalService.viewCustomerDetails(viewId);
                    break;

                case 8:
                    System.out.println("\nExiting Car Rental System. \n THANK YOU for visiting!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
