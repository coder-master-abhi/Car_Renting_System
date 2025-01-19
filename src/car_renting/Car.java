package car_renting;

import java.util.ArrayList;
import java.util.List;

public class Car {
    public final int id;
    public final String model;
    public final String type;
    public final String registrationNumber;
    public final double rentalPrice;
    public boolean isAvailable;
    private List<Customer> customerList; 

    public Car(int id, String model, String type, String registrationNumber, double rentalPrice, boolean isAvailable) {
        this.id = id;
        this.model = model;
        this.type = type;
        this.registrationNumber = registrationNumber;
        this.rentalPrice = rentalPrice;
        this.isAvailable = isAvailable;
        this.customerList = new ArrayList<>(); 
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void addCustomer(Customer customer) {
        customerList.add(customer);
    }

    public void displayDetails() {
        System.out.println("ID: " + id + ", Model: " + model + ", Type: " + type +
                ", Registration: " + registrationNumber + ", Price: RS " + rentalPrice + "/day");
    }

    public void rent(String customerName, String startDate, String endDate) {
        isAvailable = false;
        addCustomer(new Customer(customerName, startDate, endDate)); 
    }

    public void returnCar() {
        isAvailable = true;
    }
}
