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
        Event testEvent = new Event (100, "course_meal_x10", "one_round", "nickleback");
        assertEquals(true, testEvent instanceof Event);
    }

    @Test
    public void newEvent_getsguest_100() {
        Event testEvent = new Event(100, "course_meal_x10", "one_round", "nickleback");
        assertEquals(100, testEvent.getGuest());
    }
}