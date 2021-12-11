package com.thoughts_be.exception;

import com.thoughts_be.constants.ThoughtsBeConstants;

import com.thoughts_be.model.ThoughtsBeResponse;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import java.util.Arrays;
import java.util.ResourceBundle;

@Slf4j
@Aspect
@Component
@ControllerAdvice
@AllArgsConstructor
public class ThoughtsBeExceptionHandler {

    @ExceptionHandler(value = ThoughtsBeException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ResponseEntity<ThoughtsBeResponse<String>> thoughtsBeException(ThoughtsBeException airwayApplicationException){

        ResourceBundle bundle = ResourceBundle.getBundle(ThoughtsBeConstants.APPLICATION_MESSAGE_RESOURCE_FILE_NAME);

        final String exceptionMessage = bundle.getString(airwayApplicationException.getLocalizedMessage());

        log.error("ThoughtsBe Application Exception " + exceptionMessage);

        final ThoughtsBeResponse<String> thoughtsBeResponse = new ThoughtsBeResponse<>(ThoughtsBeConstants.ERROR,exceptionMessage);

        return new ResponseEntity<>(thoughtsBeResponse,HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(value = Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ResponseEntity<ThoughtsBeResponse<String>> airwayApplicationTechnicalException(Exception e){

        ResourceBundle bundle = ResourceBundle.getBundle(ThoughtsBeConstants.APPLICATION_MESSAGE_RESOURCE_FILE_NAME);

        final String exceptionMessage = bundle.getString(ThoughtsBeExceptionKey.UNEXPECTED_TECHNICAL_EXCEPTION);

        log.error("Application Technical Exception : " + Arrays.toString(e.getStackTrace()));

        final ThoughtsBeResponse<String> thoughtsBeResponse = new ThoughtsBeResponse<>(ThoughtsBeConstants.ERROR,exceptionMessage);

        return new ResponseEntity<>(thoughtsBeResponse,HttpStatus.INTERNAL_SERVER_ERROR);
    }
}