package com.thoughts_be.pattern_builder.adapter_pattern.service;

import com.thoughts_be.constants.ThoughtsBeConstants;
import com.thoughts_be.exception.ThoughtsBeException;
import com.thoughts_be.exception.ThoughtsBeExceptionKey;
import com.thoughts_be.pattern_builder.adapter_pattern.adapter_interface.AdapterPattern;
import com.thoughts_be.pattern_builder.adapter_pattern.model.AdapterServiceRequest;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@AllArgsConstructor
public class AdapterService implements AdapterPattern {

    private final EconomicDataAnalyzeService economicDataAnalyzeService;
    private final GeographicalDataAnalyzeService geographicalDataAnalyzeService;
    private final HealthServiceDataAnalyzeService healthDataAnalyzeService;

    @Override
    public String analyze(AdapterServiceRequest data){

        if(data.getDataType() != null){
            if(data.getDataType().equals(ThoughtsBeConstants.AdapterPatternConstants.ECONOMICAL_DATA)){
                return economicDataAnalyzeService.analyzeEconomicData(data.getData());
            }
            if(data.getDataType().equals(ThoughtsBeConstants.AdapterPatternConstants.GEOGRAPHICAL_DATA)){
                return geographicalDataAnalyzeService.analyzeGeographicalData(data.getData());
            }
            if(data.getDataType().equals(ThoughtsBeConstants.AdapterPatternConstants.HEALTH_SERVICE_DATA)){
                return healthDataAnalyzeService.analyzeHealthData(data.getData());
            }
            else{
                throw new ThoughtsBeException(ThoughtsBeExceptionKey.DATA_TYPE_NOT_VALID);
            }
        }
        else{
            throw new ThoughtsBeException(ThoughtsBeExceptionKey.DATA_TYPE_NULL);
        }
    }
}
