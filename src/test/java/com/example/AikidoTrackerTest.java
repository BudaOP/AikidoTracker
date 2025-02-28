package com.example;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AikidoTrackerTest {
    private AikidoTracker tracker;

    @BeforeEach
    void setUp() {
        tracker = new AikidoTracker();
    }

    @Test
    void testAddSession() {
        tracker.addSession(90);
        assertEquals(90, tracker.getTotalTime());
    }

@Test
void testCheckEligibilityMonths() {
    tracker.startDate = LocalDate.now().minusMonths(6);
    assertTrue(tracker.checkEligibility());
}

@Test
void testCheckEligibilityPracticeTime() {
    tracker.addSession(100);
    assertTrue(tracker.checkEligibility());
}


    @Test
    void testGetTotalTime() {
        tracker.addSession(60);
        tracker.addSession(40);
        assertEquals(100, tracker.getTotalTime());
    }

    @Test
    void testNotEligibleYet() {
        tracker.addSession(50);
        assertFalse(tracker.checkEligibility());
    }
}