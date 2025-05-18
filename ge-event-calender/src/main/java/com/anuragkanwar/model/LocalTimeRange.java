package com.anuragkanwar.model;

import java.time.LocalTime;

public class LocalTimeRange {
    private LocalTime start;
    private LocalTime end;

    public LocalTimeRange(LocalTime start, LocalTime end) {
        this.start = start;
        this.end = end;
    }

    public LocalTime getStart() {
        return start;
    }

    public void setStart(LocalTime start) {
        this.start = start;
    }

    public LocalTime getEnd() {
        return end;
    }

    public void setEnd(LocalTime end) {
        this.end = end;
    }
}
