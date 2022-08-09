package com.codegym;

import java.sql.Time;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class StopWatch {
    private Long startTime;
    private Long endTime;

    public StopWatch() {
        this.startTime = System.currentTimeMillis();
        this.endTime = System.currentTimeMillis();
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        long elapseTime = endTime - startTime;
        return elapseTime;
    }
}
