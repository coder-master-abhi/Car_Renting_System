package car_renting;

import java.util.ArrayList;
import java.util.List;

class RentalService {
    public final List<Car> carInventory;

    public RentalService() {
        carInventory = new ArrayList<>();
        carInventory.add(new Car(101, "BMW X5", "SUV", "BMW123", 800.0, true));
        carInventory.add(new Car(102, "Mercedes-Benz C-Class", "Sedan", "MB456", 750.0, true));
        carInventory.add(new Car(103, "Audi A4", "Sedan", "AUD789", 700.0, true));
        carInventory.add(new Car(104, "Porsche Cayenne", "SUV", "PRC012", 900.0, true));
        carInventory.add(new Car(105, "Tesla Model 3", "Sedan", "TES123", 950.0, true));
        carInventory.add(new Car(106, "Toyota Camry", "Sedan", "TOY456", 600.0, true));
        carInventory.add(new Car(107, "Ford Mustang", "Sports", "FOR789", 1200.0, true));
    }

    public void viewCustomerDetails(int carId) {
        for (Car car : carInventory) {
            if (car.id == carId) {
                System.out.println("\nCustomer Details for Car ID " + carId + ":");
                for (Customer customer : car.getCustomerList()) {
                    System.out.println(customer);
                }
                return;
            }
        }
        System.out.println("Car with ID " + carId + " not found.");
    }

    public void addCar(Car car) {
        carInventory.add(car);
        System.out.println("\nCar added successfully!");
    }

    public void viewAvailableCars() {
        System.out.printf("%-5s %-25s %-15s %-20s %-15s\n", 
                          "ID", "Model", "Type", "Registration", "Price (RS/day)");
        System.out.println("----------------------------------------------------------------------------------------");
        for (Car car : carInventory) {
            if (car.isAvailable) {
                System.out.printf("%-5d %-25s %-15s %-20s %-15.2f\n",
                                  car.id, car.model, car.type, car.registrationNumber, car.rentalPrice);
            }
        }
    }

    public void rentCar(int carId, String customerName, String startDate, String endDate) {
        for (Car car : carInventory) {
            if (car.id == carId) {
                if (car.isAvailable) {
                    car.rent(customerName, startDate, endDate); 
                    System.out.println("\nCar rented successfully!");
                    System.out.println("Rented Car Details:\n");
                    car.displayDetails();
                } else {
                    System.out.println("Car is not available for rent.");
                }
                return;
            }
        }
        System.out.println("Car with ID " + carId + " not found.");
    }

    public void returnCar(int carId) {
        for (Car car : carInventory) {
            if (car.id == carId) {
                if (!car.isAvailable) {
                    car.returnCar();
                    System.out.println("\nCar returned successfully!");
                } else {
                    System.out.println("\nCar is already available.");
                }
                return;
            }
        }
        System.out.println("Car with ID " + carId + " not found.");
    }

    public void preBookCar(int carId, String customerName, String startDate, String endDate) {
        for (Car car : carInventory) {
            if (car.id == carId) {
                if (car.isAvailable) {
                    car.rent(customerName, startDate, endDate); 
                    System.out.println("\nCar pre-booked successfully!");
                    System.out.println("Pre-Booked Car Details:\n");
                    car.displayDetails();
                } else {
                    System.out.println("Car is not available for pre-booking.");
                }
                return;
            }
        }
        System.out.println("Car with ID " + carId + " not found.");
    }

    public void calculateRentalCost(int carId, int duration) {
        for (Car car : carInventory) {
            if (car.id == carId) {
                double cost = car.rentalPrice * duration;
                System.out.println("\nRental cost for Car ID " + carId + " for " + duration + " days is: RS " + cost);
                return;
            }
        }
        System.out.println("Car with ID " + carId + " not found.");
    }
}
