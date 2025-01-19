# Car Rental System

The **Car Rental System** is a Java-based console application that allows users to manage car rentals, bookings, and returns efficiently. The system dynamically tracks car availability and provides detailed information about each car and its booking status.

---

## Features

1. **Add a Car**:
   - Allows users to add new cars to the inventory.
   - Each car has a unique ID, model, type, registration number, and rental price.

2. **View Available Cars**:
   - Displays a list of cars that are currently available for rent.
   - Dynamically updates availability based on booking and return dates.

3. **Rent a Car**:
   - Enables renting a car by specifying the car ID, customer name, and rental period (start and end dates).
   - Updates the car's status to unavailable during the rented period.

4. **Return a Car**:
   - Allows customers to return a rented car.
   - Resets the car's availability status and clears booking details.

5. **Pre-Book a Car**:
   - Facilitates pre-booking of cars for a specified date range.
   - Tracks the customer's booking information and ensures the car is unavailable during the pre-booked period.

6. **Calculate Rental Cost**:
   - Calculates the total cost of renting a car based on the rental duration and daily price.

7. **Exit**:
   - Safely exits the application.

---

## Technologies Used

- **Programming Language**: Java
- **IDE**: Any Java-supported IDE (e.g., IntelliJ IDEA, Eclipse, or VS Code)

---

## Classes and Methods

### 1. **Car Class**
#### Properties:
- `id` (int): Unique identifier for the car.
- `model` (String): Model name of the car.
- `type` (String): Car type (e.g., SUV, Sedan).
- `registrationNumber` (String): Car registration number.
- `rentalPrice` (double): Daily rental price.
- `isAvailable` (boolean): Indicates if the car is available for rent.
- `bookedBy` (String): Name of the customer who booked the car.
- `startDate` (String): Start date of the booking.
- `endDate` (String): End date of the booking.

#### Methods:
- `book(String customerName, String startDate, String endDate)`: Marks the car as booked and stores booking details.
- `clearBooking()`: Resets booking details and marks the car as available.
- `isCurrentlyAvailable()`: Dynamically checks the car's availability based on booking dates.
- `displayDetails()`: Displays detailed information about the car.

### 2. **RentalService Class**
#### Methods:
- `addCar(Car car)`: Adds a car to the inventory.
- `viewAvailableCars()`: Lists all available cars.
- `rentCar(int carId, String customerName, String startDate, String endDate)`: Rents a car and updates its availability.
- `returnCar(int carId)`: Returns a car and clears its booking details.
- `preBookCar(int carId, String customerName, String startDate, String endDate)`: Pre-books a car for specific dates.
- `calculateRentalCost(int carId, int duration)`: Computes the total rental cost based on duration.

### 3. **CarRental Class**
- Contains the main method and handles user input through a menu-driven interface.

---

## Installation and Setup

1. **Prerequisites**:
   - Ensure Java is installed on your system.
   - Set up a Java IDE for compiling and running the program.

2. **Steps**:
   - Clone or download the project.
   - Open the project in your Java IDE.
   - Compile and run the `CarRental` class.

---

## Usage

1. Launch the application.
2. Follow the menu options to perform desired actions.
3. Input the required details when prompted.
4. Exit the application by selecting option `7`.

---

## Example Output

### Rent a Car
```
1. Add a Car
2. View Available Cars
3. Rent a Car
4. Return a Car
5. Pre-Book a Car
6. Calculate Rental Cost
7. Exit
Enter your choice: 3
Enter Car ID to Rent: 101
Enter Customer Name: johhy
Enter Start Date (YYYY-MM-DD): 2024-12-12
Enter End Date (YYYY-MM-DD): 2025-01-12

Car rented successfully!
Rented Car Details:
ID: 101, Model: BMW X5, Car Name: SUV, Registration: BMW123, Price: RS 800.0/day, Available: false
Customer Name: johhy
```

---

## Future Enhancements

- Add a database for persistent storage.
- Implement a graphical user interface (GUI).
- Add authentication for user roles (e.g., Admin, Customer).
- Enhance error handling and validation.

---

## License
This project is licensed under the MIT License.

---

## Author
[Your Name]  
[Your Email]

