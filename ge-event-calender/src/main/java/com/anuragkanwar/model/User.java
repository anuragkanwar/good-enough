package com.anuragkanwar.model;

import java.time.DayOfWeek;
import java.time.ZoneId;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class User {
    private UUID userId;
    private String name;
    private String email;
    private ZoneId preferedZoneId;
    private Map<DayOfWeek, List<LocalTimeRange>> availabilityPreferences;

    public User(UUID userId, String name, String email, ZoneId preferedZoneId, Map<DayOfWeek, List<LocalTimeRange>> availabilityPreferences) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.preferedZoneId = preferedZoneId;
        this.availabilityPreferences = availabilityPreferences;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ZoneId getPreferedZoneId() {
        return preferedZoneId;
    }

    public void setPreferedZoneId(ZoneId preferedZoneId) {
        this.preferedZoneId = preferedZoneId;
    }

    public Map<DayOfWeek, List<LocalTimeRange>> getAvailabilityPreferences() {
        return availabilityPreferences;
    }

    public void setAvailabilityPreferences(Map<DayOfWeek, List<LocalTimeRange>> availabilityPreferences) {
        this.availabilityPreferences = availabilityPreferences;
    }
}
