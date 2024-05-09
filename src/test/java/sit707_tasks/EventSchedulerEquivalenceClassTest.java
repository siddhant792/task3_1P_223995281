package sit707_tasks;

import static org.junit.Assert.*;
import org.junit.Test;
import java.time.LocalDateTime;
import java.util.List;

public class EventSchedulerEquivalenceClassTest {

    // Valid date/time range

    @Test
    public void addEvent_CurrentDateTime() {
        EventScheduler scheduler = new EventScheduler();
        LocalDateTime currentDateTime = LocalDateTime.now();
        scheduler.addEvent(new EventScheduler.Event(currentDateTime, currentDateTime.plusHours(1)));
        assertEquals(1, scheduler.events.size());
    }

    @Test
    public void addEvent_FutureDateTime() {
        EventScheduler scheduler = new EventScheduler();
        LocalDateTime futureDateTime = LocalDateTime.now().plusDays(1);
        scheduler.addEvent(new EventScheduler.Event(futureDateTime, futureDateTime.plusHours(1)));
        assertEquals(1, scheduler.events.size());
    }

    @Test
    public void addEvent_PastDateTime() {
        EventScheduler scheduler = new EventScheduler();
        LocalDateTime pastDateTime = LocalDateTime.now().minusDays(1);
        scheduler.addEvent(new EventScheduler.Event(pastDateTime, pastDateTime.plusHours(1)));
        assertEquals(1, scheduler.events.size());
    }

    // Invalid date/time range

    public void addEvent_StartDateTime_OutsideRange() {
        EventScheduler scheduler = new EventScheduler();
        LocalDateTime outOfRangeDateTime = LocalDateTime.MIN;
        scheduler.addEvent(new EventScheduler.Event(outOfRangeDateTime, outOfRangeDateTime.plusHours(1)));
    }

    public void addEvent_EndDateTime_OutsideRange() {
        EventScheduler scheduler = new EventScheduler();
        LocalDateTime outOfRangeDateTime = LocalDateTime.MAX;
        scheduler.addEvent(new EventScheduler.Event(outOfRangeDateTime.minusHours(1), outOfRangeDateTime));
    }

    // Event duration

    @Test
    public void addEvent_Duration_1Minute() {
        EventScheduler scheduler = new EventScheduler();
        LocalDateTime startDateTime = LocalDateTime.now();
        LocalDateTime endDateTime = startDateTime.plusMinutes(1);
        scheduler.addEvent(new EventScheduler.Event(startDateTime, endDateTime));
        assertEquals(1, scheduler.events.size());
    }

    @Test
    public void addEvent_Duration_1Hour() {
        EventScheduler scheduler = new EventScheduler();
        LocalDateTime startDateTime = LocalDateTime.now();
        LocalDateTime endDateTime = startDateTime.plusHours(1);
        scheduler.addEvent(new EventScheduler.Event(startDateTime, endDateTime));
        assertEquals(1, scheduler.events.size());
    }

    // Add more test cases for different durations

    // Overlapping events

    public void addEvent_Overlapping() {
        EventScheduler scheduler = new EventScheduler();
        LocalDateTime startDateTime = LocalDateTime.now();
        LocalDateTime endDateTime = startDateTime.plusHours(1);
        scheduler.addEvent(new EventScheduler.Event(startDateTime, endDateTime));
        // Try to add overlapping event
        scheduler.addEvent(new EventScheduler.Event(startDateTime.plusMinutes(30), endDateTime.plusMinutes(30)));
    }

    // Non-overlapping events

    @Test
    public void addEvent_NonOverlapping() {
        EventScheduler scheduler = new EventScheduler();
        LocalDateTime startDateTime = LocalDateTime.now();
        LocalDateTime endDateTime = startDateTime.plusHours(1);
        scheduler.addEvent(new EventScheduler.Event(startDateTime, endDateTime));
        // Add non-overlapping event
        scheduler.addEvent(new EventScheduler.Event(endDateTime.plusMinutes(30), endDateTime.plusHours(2)));
        assertEquals(2, scheduler.events.size());
    }

    // Empty scheduler

    @Test
    public void findAvailableTimeSlots_EmptyScheduler() {
        EventScheduler scheduler = new EventScheduler();
        LocalDateTime startDateTime = LocalDateTime.now();
        LocalDateTime endDateTime = startDateTime.plusDays(1);
        List<EventScheduler.TimeSlot> timeSlots = scheduler.findAvailableTimeSlots(startDateTime, endDateTime, 60);
        assertNotNull(timeSlots);
        assertEquals(23, timeSlots.size());
    }
}

