package com.anuragkanwar.model;

import com.anuragkanwar.enums.MeetingLocation;
import com.anuragkanwar.enums.ParticipantStatus;

import java.time.Instant;
import java.time.ZonedDateTime;
import java.util.Map;
import java.util.UUID;

public abstract class Meeting {
    protected UUID id;
    protected String title;
    protected String description;
    protected UUID organizerId;
    protected Map<UUID, ParticipantStatus> participants;
    protected Boolean isRecurring;
    protected ZonedDateTime startTimeUTC;
    protected ZonedDateTime endTimeUTC;
    protected MeetingLocation meetingLocation;
    protected String meetingLink;

    protected Instant creationTime;
    protected Instant updateTime;

    public Meeting(UUID id, String title, String description, UUID organizerId, Map<UUID, ParticipantStatus> participants, Boolean isRecurring, ZonedDateTime startTimeUTC, ZonedDateTime endTimeUTC, MeetingLocation meetingLocation, String meetingLink, Instant creationTime, Instant updateTime) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.organizerId = organizerId;
        this.participants = participants;
        this.isRecurring = isRecurring;
        this.startTimeUTC = startTimeUTC;
        this.endTimeUTC = endTimeUTC;
        this.meetingLocation = meetingLocation;
        this.meetingLink = meetingLink;
        this.creationTime = creationTime;
        this.updateTime = updateTime;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UUID getOrganizerId() {
        return organizerId;
    }

    public void setOrganizerId(UUID organizerId) {
        this.organizerId = organizerId;
    }

    public Map<UUID, ParticipantStatus> getParticipants() {
        return participants;
    }

    public void setParticipants(Map<UUID, ParticipantStatus> participants) {
        this.participants = participants;
    }

    public Boolean getRecurring() {
        return isRecurring;
    }

    public void setRecurring(Boolean recurring) {
        isRecurring = recurring;
    }

    public ZonedDateTime getStartTimeUTC() {
        return startTimeUTC;
    }

    public void setStartTimeUTC(ZonedDateTime startTimeUTC) {
        this.startTimeUTC = startTimeUTC;
    }

    public ZonedDateTime getEndTimeUTC() {
        return endTimeUTC;
    }

    public void setEndTimeUTC(ZonedDateTime endTimeUTC) {
        this.endTimeUTC = endTimeUTC;
    }

    public MeetingLocation getMeetingLocation() {
        return meetingLocation;
    }

    public void setMeetingLocation(MeetingLocation meetingLocation) {
        this.meetingLocation = meetingLocation;
    }

    public String getMeetingLink() {
        return meetingLink;
    }

    public void setMeetingLink(String meetingLink) {
        this.meetingLink = meetingLink;
    }

    public Instant getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Instant creationTime) {
        this.creationTime = creationTime;
    }

    public Instant getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Instant updateTime) {
        this.updateTime = updateTime;
    }
}
