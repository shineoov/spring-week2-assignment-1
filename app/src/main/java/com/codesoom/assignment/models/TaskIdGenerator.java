package com.codesoom.assignment.models;

public class TaskIdGenerator {
    private static Long sequence = 0L;

    public static Long getSequence() {
        return sequence++;
    }
}
