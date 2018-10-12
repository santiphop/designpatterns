package compositetour;

public class SingleTour implements Tour {
    private String name;
    private double price;
    private int allSeats;
    private int reservedSeats;

    public SingleTour(String name, double price, int allSeats) {
        this.name = name;
        this.price = price;
        this.allSeats = allSeats;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public int getAvailableSeats() {
        return allSeats - reservedSeats;
    }

    public void reserve(int i) {
        if (getAvailableSeats() > i)
            reservedSeats += i;
        else
            System.err.println("not enough seats.");
    }
}
