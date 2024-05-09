package sit707_tasks;

import static org.junit.Assert.*;
import org.junit.Test;
import java.time.LocalDateTime;
import java.util.List;

public class EventSchedulerBoundaryValueTest {

    @Test
    public void addEvent_StartDateTime_MinValue() {
        EventScheduler scheduler = new EventScheduler();
        scheduler.addEvent(new EventScheduler.Event(LocalDateTime.MIN, LocalDateTime.now()));
        assertEquals(1, scheduler.events.size());
    }

    @Test
    public void addEvent_EndDateTime_MinValue() {
        EventScheduler scheduler = new EventScheduler();
        scheduler.addEvent(new EventScheduler.Event(LocalDateTime.now(), LocalDateTime.MIN));
        assertEquals(1, scheduler.events.size());
    }

    @Test
    public void addEvent_StartDateTime_MaxValue() {
        EventScheduler scheduler = new EventScheduler();
        scheduler.addEvent(new EventScheduler.Event(LocalDateTime.MAX, LocalDateTime.now()));
        assertEquals(1, scheduler.events.size());
    }
    
    @Test
    public void addEvent_EndDateTime_MaxValue() {
        EventScheduler scheduler = new EventScheduler();
        scheduler.addEvent(new EventScheduler.Event(LocalDateTime.now(), LocalDateTime.MAX));
        assertEquals(1, scheduler.events.size());
    }

    @Test
    public void addEvent_Duration_1Minute() {
        EventScheduler scheduler = new EventScheduler();
        LocalDateTime startDateTime = LocalDateTime.now();
        LocalDateTime endDateTime = startDateTime.plusMinutes(1);
        scheduler.addEvent(new EventScheduler.Event(startDateTime, endDateTime));
        assertEquals(1, scheduler.events.size());
    }

    @Test
    public void addEvent_Duration_0Minute() {
        EventScheduler scheduler = new EventScheduler();
        LocalDateTime startDateTime = LocalDateTime.now();
        scheduler.addEvent(new EventScheduler.Event(startDateTime, startDateTime));
        assertEquals(1, scheduler.events.size());
    }

    @Test
    public void addEvent_Duration_CrossMidnight() {
        EventScheduler scheduler = new EventScheduler();
        LocalDateTime startDateTime = LocalDateTime.MAX.minusMinutes(1);
        LocalDateTime endDateTime = LocalDateTime.MIN.plusMinutes(1);
        scheduler.addEvent(new EventScheduler.Event(startDateTime, endDateTime));
        assertEquals(1, scheduler.events.size());
    }

    public void addEvent_StartAfterEnd() {
        EventScheduler scheduler = new EventScheduler();
        scheduler.addEvent(new EventScheduler.Event(LocalDateTime.now(), LocalDateTime.MIN));
    }

    public void addEvent_NegativeDuration() {
        EventScheduler scheduler = new EventScheduler();
        scheduler.addEvent(new EventScheduler.Event(LocalDateTime.now(), LocalDateTime.now().minusMinutes(1)));
    }

    @Test
    public void findAvailableTimeSlots_StartTime_MinValue() {
        EventScheduler scheduler = new EventScheduler();
        LocalDateTime startDateTime = LocalDateTime.now().minusYears(100);
        LocalDateTime endDateTime = LocalDateTime.now();
        List<EventScheduler.TimeSlot> timeSlots = scheduler.findAvailableTimeSlots(startDateTime, endDateTime, 60);
        assertNotNull(timeSlots);
    }

    @Test
    public void findAvailableTimeSlots_EndTime_MinValue() {
        EventScheduler scheduler = new EventScheduler();
        LocalDateTime startDateTime = LocalDateTime.now();
        List<EventScheduler.TimeSlot> timeSlots = scheduler.findAvailableTimeSlots(startDateTime, LocalDateTime.MIN, 60);
        assertNotNull(timeSlots);
    }

    @Test
    public void findAvailableTimeSlots_StartTime_MaxValue() {
        EventScheduler scheduler = new EventScheduler();
        LocalDateTime endDateTime = LocalDateTime.now();
        List<EventScheduler.TimeSlot> timeSlots = scheduler.findAvailableTimeSlots(LocalDateTime.MAX, endDateTime, 60);
        assertNotNull(timeSlots);
    }

    @Test
    public void findAvailableTimeSlots_EndTime_MaxValue() {
        EventScheduler scheduler = new EventScheduler();
        LocalDateTime startDateTime = LocalDateTime.now();
        LocalDateTime maxEndDateTime = LocalDateTime.now().plusYears(1);
        List<EventScheduler.TimeSlot> timeSlots = scheduler.findAvailableTimeSlots(startDateTime, maxEndDateTime, 60);
        assertNotNull(timeSlots);
    }

    @Test
    public void findAvailableTimeSlots_Duration_1Minute() {
        EventScheduler scheduler = new EventScheduler();
        LocalDateTime startDateTime = LocalDateTime.now();
        LocalDateTime endDateTime = startDateTime.plusMinutes(1);
        List<EventScheduler.TimeSlot> timeSlots = scheduler.findAvailableTimeSlots(startDateTime, endDateTime, 1);
        assertNotNull(timeSlots);
    }

    @Test
    public void findAvailableTimeSlots_Duration_0Minute() {
        EventScheduler scheduler = new EventScheduler();
        LocalDateTime startDateTime = LocalDateTime.now();
        List<EventScheduler.TimeSlot> timeSlots = scheduler.findAvailableTimeSlots(startDateTime, startDateTime, 0);
        assertNotNull(timeSlots);
    }

    @Test
    public void findAvailableTimeSlots_Duration_CrossMidnight() {
        EventScheduler scheduler = new EventScheduler();
        LocalDateTime startDateTime = LocalDateTime.MAX.minusMinutes(1);
        LocalDateTime endDateTime = LocalDateTime.MIN.plusMinutes(1);
        List<EventScheduler.TimeSlot> timeSlots = scheduler.findAvailableTimeSlots(startDateTime, endDateTime, 1);
        assertNotNull(timeSlots);
    }
}

