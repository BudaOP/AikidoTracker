package com.example;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class AikidoTracker {
    private List<Integer> sessions = new ArrayList<>();
    protected LocalDate startDate;

    public AikidoTracker() {
        startDate = LocalDate.now();
    }

    public void addSession(int minutes) {
        sessions.add(minutes);
    }

    public int getTotalTime() {
        return sessions.stream().mapToInt(Integer::intValue).sum();
    }

    public boolean checkEligibility() {
        long monthsPassed = ChronoUnit.MONTHS.between(startDate, LocalDate.now());
        return getTotalTime() >= 100 || monthsPassed >= 6;
    }
}
