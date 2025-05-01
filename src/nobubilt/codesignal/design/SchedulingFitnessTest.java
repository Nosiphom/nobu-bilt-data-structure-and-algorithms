package nobubilt.codesignal.design;

import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.*;

public class SchedulingFitnessTest {



	    @Test
	    public void testAddActivityUser1Run() {
	        SchedulingFitness system = new SchedulingFitness();
	        boolean result = system.addActivity("user1", "run", 5000);
	        assertTrue(result);
	        Integer activityDistance = system.getActivity("user1", "run");
	        assertEquals(5000, activityDistance);
	    }
	    
	    @Test
	    public void testAddActivityUser2Bike() {
	        SchedulingFitness system = new SchedulingFitness();
	        boolean result = system.addActivity("user2", "bike", 10000);
	        assertTrue(result);
	        Integer activityDistance = system.getActivity("user2", "bike");
	        assertEquals(10000, activityDistance);
	    }

	    @Test
	    public void testAddActivityUser1Swim() {
	        SchedulingFitness system = new SchedulingFitness();
	        boolean result = system.addActivity("user1", "swim", 1500);
	        assertTrue(result);
	        Integer activityDistance = system.getActivity("user1", "swim");
	        assertEquals(1500, activityDistance);
	    }

	    @Test
	    public void testScheduleEventUser1Run() {
	        SchedulingFitness system = new SchedulingFitness();
	        boolean result = system.scheduleEvent(1, "user1", "run", 3000, 2);
	        assertTrue(result);
	        List<Map<String, Object>> agenda = system.getAgenda("user1", 0, 5);
	        assertEquals(1, agenda.size());
	        assertEquals("run", agenda.get(0).get("activityType"));
	        assertEquals(3000, agenda.get(0).get("distance"));
	        assertEquals(2L, agenda.get(0).get("eventTime"));
	    }

	    @Test
	    public void testScheduleEventUser2Bike() {
	        SchedulingFitness system = new SchedulingFitness();
	        boolean result = system.scheduleEvent(3, "user2", "bike", 5000, 4);
	        assertTrue(result);
	        List<Map<String, Object>> agenda = system.getAgenda("user2", 0, 5);
	        assertEquals(1, agenda.size());
	        assertEquals("bike", agenda.get(0).get("activityType"));
	        assertEquals(5000, agenda.get(0).get("distance"));
	        assertEquals(4L, agenda.get(0).get("eventTime"));
	    }

	    @Test
	    public void testWrongParameterTypeInAddActivity() {
	        SchedulingFitness system = new SchedulingFitness();
	        boolean result = system.addActivity("user1", "1", -5);
	        assertFalse(result);
	    }

	    @Test
	    public void testAddActivityWithScheduledEvent() {
	        SchedulingFitness system = new SchedulingFitness();
	        system.scheduleEvent(1, "user1", "run", 3000, 2);
	        boolean result = system.addActivity("user1", "run", 5000);
	        assertTrue(result);
	        Integer activityDistance = system.getActivity("user1", "run");
	        assertEquals(8000, activityDistance);
	    }

	    @Test
	    public void testMultipleEventsSorting() {
	        SchedulingFitness system = new SchedulingFitness();
	        system.scheduleEvent(1, "user1", "run", 3000, 10);
	        system.scheduleEvent(2, "user1", "bike", 15000, 5);
	        List<Map<String, Object>> agenda = system.getAgenda("user1", 0, 15);
	        assertEquals("bike", agenda.get(0).get("activityType"));
	        assertEquals(15000, agenda.get(0).get("distance"));
	        assertEquals(5L, agenda.get(0).get("eventTime"));
	        assertEquals("run", agenda.get(1).get("activityType"));
	        assertEquals(3000, agenda.get(1).get("distance"));
	        assertEquals(10L, agenda.get(1).get("eventTime"));
	    }

	    @Test
	    public void testEventOutsideRequestedTimeframe() {
	        SchedulingFitness system = new SchedulingFitness();
	        system.scheduleEvent(1, "user2", "swim", 2000, 20);
	        system.scheduleEvent(2, "user2", "run", 5000, 30);
	        List<Map<String, Object>> agendaWithinTimeframe = system.getAgenda("user2", 10, 25);
	        assertEquals(1, agendaWithinTimeframe.size());
	        assertEquals("swim", agendaWithinTimeframe.get(0).get("activityType"));
	        assertEquals(2000, agendaWithinTimeframe.get(0).get("distance"));
	        assertEquals(20L, agendaWithinTimeframe.get(0).get("eventTime"));

	        List<Map<String, Object>> agendaOutsideTimeframe = system.getAgenda("user2", 31, 40);
	        assertTrue(agendaOutsideTimeframe.isEmpty());
	    }
	}

