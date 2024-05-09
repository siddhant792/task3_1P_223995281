package sit707_tasks;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class EventScheduler {

    public List<Event> events;

    public EventScheduler() {
        events = new ArrayList<>();
    }

    public void addEvent(Event event) {
        events.add(event);
    }

    public boolean hasConflict(Event event) {
        for (Event existingEvent : events) {
            if (existingEvent.conflictsWith(event)) {
                return true;
            }
        }
        return false;
    }

    public List<TimeSlot> findAvailableTimeSlots(LocalDateTime startDateTime, LocalDateTime endDateTime, int durationMinutes) {
        List<TimeSlot> availableTimeSlots = new ArrayList<>();

        LocalDateTime currentDateTime = startDateTime;
        while (currentDateTime.isBefore(endDateTime) || currentDateTime.isEqual(endDateTime)) {
            LocalDateTime slotEnd = currentDateTime.plusMinutes(durationMinutes);
            if (slotEnd.isAfter(endDateTime) || slotEnd.isEqual(endDateTime)) {
                break;
            }

            TimeSlot timeSlot = new TimeSlot(currentDateTime, slotEnd);
            if (!hasConflict(timeSlot.toEvent())) {
                availableTimeSlots.add(timeSlot);
            }

            currentDateTime = slotEnd;
        }

        return availableTimeSlots;
    }

    public static class Event {
        private LocalDateTime startDateTime;
        private LocalDateTime endDateTime;

        public Event(LocalDateTime startDateTime, LocalDateTime endDateTime) {
            this.startDateTime = startDateTime;
            this.endDateTime = endDateTime;
        }

        public LocalDateTime getStartDateTime() {
            return startDateTime;
        }

        public LocalDateTime getEndDateTime() {
            return endDateTime;
        }

        public boolean conflictsWith(Event other) {
            return this.startDateTime.isBefore(other.endDateTime) && other.startDateTime.isBefore(this.endDateTime);
        }
    }

    public static class TimeSlot {
        private LocalDateTime startDateTime;
        private LocalDateTime endDateTime;

        public TimeSlot(LocalDateTime startDateTime, LocalDateTime endDateTime) {
            this.startDateTime = startDateTime;
            this.endDateTime = endDateTime;
        }

        public LocalDateTime getStartDateTime() {
            return startDateTime;
        }

        public LocalDateTime getEndDateTime() {
            return endDateTime;
        }

        public Event toEvent() {
            return new Event(startDateTime, endDateTime);
        }
    }
}

