package com.company;

public class valueExeption extends Exception {

    private final String code;

    public valueExeption(String code) {
        super();
        this.code = code;
    }

    public valueExeption(String message, String code) {
        super(message);
        this.code = code;
    }

    public valueExeption(Throwable cause, String code) {
        super(cause);
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}


