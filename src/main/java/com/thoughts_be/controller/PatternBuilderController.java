package com.thoughts_be.controller;

import com.thoughts_be.constants.ThoughtsBeConstants;
import com.thoughts_be.model.ThoughtsBeResponse;
import com.thoughts_be.pattern_builder.adapter_pattern.model.AdapterServiceRequest;
import com.thoughts_be.pattern_builder.adapter_pattern.service.AdapterService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/patternBuilder")
@AllArgsConstructor
public class PatternBuilderController {

    private final AdapterService adapterService;

    @GetMapping("/adapterPatternService")
    public ResponseEntity<ThoughtsBeResponse<String>> adapterPatternService(AdapterServiceRequest adapterServiceRequest){
        return ResponseEntity.ok(new ThoughtsBeResponse<>(ThoughtsBeConstants.SUCCESS, adapterService.analyze(adapterServiceRequest)));
    }
}
