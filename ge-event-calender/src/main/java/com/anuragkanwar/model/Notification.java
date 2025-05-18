package com.anuragkanwar.model;

import java.time.ZonedDateTime;
import java.util.UUID;

public class Notification {
    private UUID id;
    private UUID userId;
    private UUID meetingId;
    private String message;
    private ZonedDateTime sentAt;
    private Boolean isRead;
}
