package com.thoughts_be.exception;

public class ThoughtsBeException extends RuntimeException{
    public ThoughtsBeException(String exceptionKey){
        super(exceptionKey);
    }
}
