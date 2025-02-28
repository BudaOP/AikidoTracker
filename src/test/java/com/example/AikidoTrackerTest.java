package com.example;

import static org.junit.jupiter.api.Assertions.*;

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
    void testCheckEligibility() {
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
