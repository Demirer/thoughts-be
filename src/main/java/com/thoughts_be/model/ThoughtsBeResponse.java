package com.thoughts_be.model;

import lombok.Data;
import java.io.Serializable;

@Data
public class ThoughtsBeResponse<T> implements Serializable {

    private T response;
    private int responseCode;
    public ThoughtsBeResponse(int response_code, T response){

        this.responseCode = response_code;
        this.response = response;
    }
}
