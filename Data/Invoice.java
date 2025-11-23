public class Invoice {
    public String invoiceId;
    public String customerName;
    public int ticketCount;
    public double total;
    public String date; // ngày suất chiếu
    public String showMonth;

    public Invoice(String invoiceId, String customerName, int ticketCount, double total, String date) {
        this.invoiceId = invoiceId;
        this.customerName = customerName;
        this.ticketCount = ticketCount;
        this.total = total;
        this.date = date;
        this.showMonth = date.substring(0, 7); // yyyy-MM
    }

    @Override
    public String toString() {
        return invoiceId + "," + customerName + "," + ticketCount + "," + total + "," + date;
    }
}
