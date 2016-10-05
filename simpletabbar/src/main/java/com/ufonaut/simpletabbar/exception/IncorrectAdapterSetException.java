package com.ufonaut.simpletabbar.exception;

/**
 * Created by IlliaNewPC on 05.10.2016.
 */
public class IncorrectAdapterSetException extends Exception {

    String message;

    public IncorrectAdapterSetException(String s) {
        this.message = s;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
