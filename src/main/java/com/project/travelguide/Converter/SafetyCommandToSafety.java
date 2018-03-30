package com.project.travelguide.Converter;

import com.project.travelguide.Commands.SafetyCommad;
import com.project.travelguide.Models.Safety;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class SafetyCommandToSafety implements Converter<SafetyCommad, Safety> {
    @Override
    public Safety convert(SafetyCommad source) {
        if(source == null)return null;
        final Safety safety = new Safety();
        safety.setId(source.getId());
        safety.setPlaceDetails(source.getPlaceDetails());
        safety.setSafetyMeter(source.getSafetyMeter());

        return safety;
    }
}
