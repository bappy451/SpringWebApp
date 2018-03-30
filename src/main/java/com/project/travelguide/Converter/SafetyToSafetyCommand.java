package com.project.travelguide.Converter;

import com.project.travelguide.Commands.SafetyCommad;
import com.project.travelguide.Models.Safety;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class SafetyToSafetyCommand implements Converter<Safety,SafetyCommad> {
    @Override
    public SafetyCommad convert(Safety source) {
        if(source == null)return null;
        final SafetyCommad commad = new SafetyCommad();
        commad.setId(source.getId());
        commad.setPlaceDetails(source.getPlaceDetails());
        commad.setSafetyMeter(source.getSafetyMeter());

        return commad;
    }
}
