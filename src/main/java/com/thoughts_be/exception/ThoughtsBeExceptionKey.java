package com.thoughts_be.exception;

public class ThoughtsBeExceptionKey {

    private ThoughtsBeExceptionKey(){

        throw new IllegalStateException(MESSAGE_KEY_ACCESS_ERROR);
    }

    static final String MESSAGE_KEY_ACCESS_ERROR = "ExceptionKey.java cannot be accessed with constructor";
    public static final String UNEXPECTED_TECHNICAL_EXCEPTION = "exception.unexpected_technical_exception";
    public static final String DATA_TYPE_NOT_VALID = "exception.adapter_pattern.data_type_not_valid";
    public static final String DATA_TYPE_NULL = "exception.adapter_pattern.data_type_null";
}
