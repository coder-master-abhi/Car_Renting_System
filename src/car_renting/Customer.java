package car_renting;

public class Customer {
    private String name;
    private String startDate;
    private String endDate;

    public Customer(String name, String startDate, String endDate) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getName() {
        return name;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    @Override
    public String toString() {
        return "Customer Name: " + name + ", Start Date: " + startDate + ", End Date: " + endDate;
    }
}
