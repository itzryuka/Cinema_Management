public class Customer {
    public String customerId;
    public String customerName;
    public String phone;
    public String totalTickets; // lưu tổng vé dạng String

    public Customer(String customerId, String customerName, String phone) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.phone = phone;
        this.totalTickets = "0";
    }

    // tăng tổng vé
    public void incrementTickets() {
        try {
            int count = Integer.parseInt(this.totalTickets);
            count++;
            this.totalTickets = String.valueOf(count);
        } catch (NumberFormatException e) {
            this.totalTickets = "1";
        }
    }
}



