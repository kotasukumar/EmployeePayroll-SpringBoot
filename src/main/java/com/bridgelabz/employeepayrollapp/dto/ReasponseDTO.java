package com.bridgelabz.employeepayrollapp.dto;

public class ReasponseDTO {
    private String message;
    private Object data;

    public ReasponseDTO(String message, Object data) {
        this.message = message;
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
