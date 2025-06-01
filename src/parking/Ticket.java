package parking;

import java.time.LocalDate;
import java.util.Date;

public class Ticket {
    private LocalDate startTime;
    private LocalDate endTime;

    public Ticket(LocalDate startTime) {
        this.startTime = startTime;
        this.endTime = startTime;
    }
    public LocalDate getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDate startTime) {
        this.startTime = startTime;
    }

    public LocalDate getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDate endTime) {
        this.endTime = endTime;
    }
}
