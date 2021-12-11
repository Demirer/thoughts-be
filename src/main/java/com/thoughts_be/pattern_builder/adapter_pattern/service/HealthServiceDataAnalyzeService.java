package com.thoughts_be.pattern_builder.adapter_pattern.service;

import com.thoughts_be.pattern_builder.adapter_pattern.adapter_interface.HealthServiceDataAnalyze;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class HealthServiceDataAnalyzeService implements HealthServiceDataAnalyze {

    @Override
    public String analyzeHealthData(String data){
        return "Analyzed health graph saved for given data: " +data;
    }
}
