package com.anuragkanwar.model;

import com.anuragkanwar.enums.MeetingLocation;
import com.anuragkanwar.enums.ParticipantStatus;

import java.time.Instant;
import java.time.ZonedDateTime;
import java.util.Map;
import java.util.UUID;

public class RecurringMeeting extends Meeting {

    private String rRule;

    public RecurringMeeting(UUID id, String title, String description, UUID organizerId, Map<UUID, ParticipantStatus> participants, Boolean isRecurring, ZonedDateTime startTimeUTC, ZonedDateTime endTimeUTC, MeetingLocation meetingLocation, String meetingLink, Instant creationTime, Instant updateTime) {
        super(id, title, description, organizerId, participants, isRecurring, startTimeUTC, endTimeUTC, meetingLocation, meetingLink, creationTime, updateTime);
    }


    public String getrRule() {
        return rRule;
    }

    public void setrRule(String rRule) {
        this.rRule = rRule;
    }
}
