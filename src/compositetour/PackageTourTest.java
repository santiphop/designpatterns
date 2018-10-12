package compositetour;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PackageTourTest {
    PackageTour packageTour;

    @BeforeEach
    void init() {
        packageTour = new PackageTour("tetealltour");
        packageTour.add(new SingleTour("ingtour", 10, 20));
        packageTour.add(new SingleTour("pktour", 25, 22));
        packageTour.add(new SingleTour("poontour", 30, 15));
    }

    @Test
    void getNameTest() {
        assertEquals("tetealltour", packageTour.getName());
    }

    @Test
    void getAvailTest() {
        assertEquals(15, packageTour.getAvailableSeats());
    }

    @Test
    void getPriceTest() {
        assertEquals(58.5, packageTour.getPrice());
    }



}