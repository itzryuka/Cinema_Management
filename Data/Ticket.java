public class Ticket {
    public String customerId;
    public String customerName;
    public String phone;
    public String seatCode;
    public String movieName;

    public Ticket(String customerId, String customerName, String phone,
                  String seatCode, String movieName) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.phone = phone;
        this.seatCode = seatCode;
        this.movieName = movieName;
    }
}
