package com.project.travelguide.Converter;

import com.project.travelguide.Commands.DistanceMeterCommand;
import com.project.travelguide.Models.DistanceMeter;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class DistanceMeterCommandToDistanceMeter implements Converter<DistanceMeterCommand, DistanceMeter> {

    @Override
    public DistanceMeter convert(DistanceMeterCommand source) {
        if(source == null) return null;

        final DistanceMeter distanceMeter = new DistanceMeter();
        distanceMeter.setId(source.getId());
        distanceMeter.setEndingZone(source.getEndingZone());
        distanceMeter.setStringZone(source.getStringZone());
        distanceMeter.setTotalDistance(source.getTotalDistance());

        return distanceMeter;
    }
}
