package finalexam.task1;

public class Ticket {
    private String event;
    private String date;
    private String seat;
    private double price;

    public Ticket(String event, String date, String seat, double price) {
        this.event = event;
        this.date = date;
        this.seat = seat;
        this.price = price;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "event='" + event + '\'' +
                ", date='" + date + '\'' +
                ", seat='" + seat + '\'' +
                ", price=" + price +
                '}';
    }
}
