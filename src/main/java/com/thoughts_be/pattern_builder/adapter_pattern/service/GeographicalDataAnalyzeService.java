package com.thoughts_be.pattern_builder.adapter_pattern.service;

import com.thoughts_be.pattern_builder.adapter_pattern.adapter_interface.GeographicalDataAnalyze;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class GeographicalDataAnalyzeService implements GeographicalDataAnalyze {

    @Override
    public String analyzeGeographicalData(String data){
        return "Analyzed geographical graph saved for given data: " +data;
    }

}
