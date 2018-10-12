package compositetour;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingleTourTest {
    SingleTour singleTour;

    @BeforeEach
    void init() {
        singleTour = new SingleTour("ingtour", 10, 20);
    }

    @Test
    void getNameTest() {
        assertEquals("ingtour", singleTour.getName());
    }

    @Test
    void getAvailTest() {
        singleTour.reserve(5);
        assertEquals(15, singleTour.getAvailableSeats());
    }

    @Test
    void getAvailOvernumTest() {
        singleTour.reserve(30);
        assertEquals(20, singleTour.getAvailableSeats());
    }

    @Test
    void getPriceTest() {
        assertEquals(10, singleTour.getPrice());
    }



}