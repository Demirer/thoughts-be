package com.thoughts_be.pattern_builder.adapter_pattern.model;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class AdapterServiceRequest {

    @NotNull
    private String data;
    @NotNull
    private String dataType;
}
