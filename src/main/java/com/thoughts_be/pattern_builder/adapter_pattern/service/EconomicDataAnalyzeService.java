package com.thoughts_be.pattern_builder.adapter_pattern.service;

import com.thoughts_be.pattern_builder.adapter_pattern.adapter_interface.EconomicDataAnalyze;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class EconomicDataAnalyzeService implements EconomicDataAnalyze {

    @Override
    public String analyzeEconomicData(String data){
        return "Analyzed economic graph saved for given data: " +data;
    }
}
