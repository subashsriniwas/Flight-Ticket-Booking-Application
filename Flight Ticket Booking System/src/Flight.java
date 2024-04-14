public class Flight {
    private String name;
    private int Id = 1;
    private int seatNo;
    private int FlightNo;
    private int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(int seatNo) {
        this.seatNo = seatNo;
    }

    public int getFlightNo() {
        return FlightNo;
    }

    public void setFlightNo(int flightNo) {
        FlightNo = flightNo;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "name='" + name + '\'' +
                ", Passenger Id=" + Id +
                ", seatNo=" + seatNo +
                ", FlightNo=" + FlightNo +
                ", price=" + price +
                '}';
    }
}

