package com.thoughts_be.pattern_builder.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/patternBuilder")
@AllArgsConstructor
public class PatternBuilderController {

    @GetMapping("/builder")
    public ResponseEntity<String> builder(){
        //TODO: Complete builder framework.
        return ResponseEntity.ok("Needs to be coded");
    }

}
