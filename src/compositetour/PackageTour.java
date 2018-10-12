package compositetour;

import java.util.ArrayList;
import java.util.List;

public class PackageTour implements Tour {
    private String packageName;
    private List<Tour> tours = new ArrayList<>();

    public PackageTour(String packageName) {
        this.packageName = packageName;
    }

    public void add(Tour tour) {
        tours.add(tour);
    }

    @Override
    public String getName() {
        return packageName;
    }

    @Override
    public double getPrice() {
        double total = 0;
        for (Tour t :
                tours) {
            total += t.getPrice();
        }
        return total*0.9;
    }

    @Override
    public int getAvailableSeats() {
        if (tours.isEmpty())
            return 0;
        int minSeats = tours.get(0).getAvailableSeats();
        for (Tour t :
                tours) {
            minSeats = Math.min(minSeats, t.getAvailableSeats());
        }
        return minSeats;
    }
}
