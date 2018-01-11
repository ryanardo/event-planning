package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EventTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void newEvent_instantiatesCorrectly() throws Exception {
        Event testEvent = new Event (100, "", "one_round", "nickleback");
        assertEquals(true, testEvent instanceof Event);
    }

    @Test
    public void newEvent_getGuest_100() {
        Event testEvent = new Event(100, "x10", "one_round", "nickleback");
        assertEquals(100, testEvent.getGuest());
    }

    @Test
    public void newEvent_getFood_x10() {
        Event testEvent = new Event(100, "x10", "one_round", "nickleback");
        assertEquals("x10", testEvent.getFood());
    }

    @Test
    public void newEvent_getBeverage_one_round() {
        Event testEvent = new Event(100, "x10", "one_round", "nickleback");
        assertEquals("one_round", testEvent.getBeverage());
    }

    @Test
    public void newEvent_getEntertainment() {
        Event testEvent = new Event(100, "x10", "one_round", "nickleback");
        assertEquals("nickleback", testEvent.getEntertainment());
    }

    @Test
    public void newEvent_getPriceFood_100() {
        Event testEvent = new Event(100, "x10", "one_round", "nickleback");
        assertEquals(100, testEvent.getPriceFood());
    }

    @Test
    public void newEvent_getPriceBeverage_10() {
        Event testEvent = new Event(100, "x10", "one_round", "nickleback");
        assertEquals(10, testEvent.getPriceBeverage());
    }
}