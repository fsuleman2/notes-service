package com.syed.notesapp.model;

public class ApiResponse {
    private String message;
    private Object data;
    private boolean success;

    public ApiResponse(String message, Object data, boolean success) {
        this.message = message;
        this.data = data;
        this.success = success;
    }

    // Getters and Setters
}