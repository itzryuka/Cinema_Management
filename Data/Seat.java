public class Seat {
    String roomId;
    String code;
    String type;     // Normal hoặc VIP
    String status;      // AVAILABLE = trống, BOOKED = đã đặt

    public Seat(String roomId, String code, String type, String status) {
        this.roomId = roomId;
        this.code = code;
        this.type = type;
        this.status = status;
    }
    public String getCode() {
        return code;
    }
    public String getType() {
        return type;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
