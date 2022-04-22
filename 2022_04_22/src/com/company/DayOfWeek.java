package com.company;

public enum DayOfWeek {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    static DayOfWeek fromString(String name) {
        for (DayOfWeek dayOfWeek : values()) {
            if (dayOfWeek.name().equalsIgnoreCase(name)) {
                return dayOfWeek;
            }
        }
        return null;
    }
}

