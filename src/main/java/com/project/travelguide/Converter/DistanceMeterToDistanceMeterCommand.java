package com.project.travelguide.Converter;

import com.project.travelguide.Commands.DistanceMeterCommand;
import com.project.travelguide.Models.DistanceMeter;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class DistanceMeterToDistanceMeterCommand implements Converter<DistanceMeter, DistanceMeterCommand> {

    @Override
    public DistanceMeterCommand convert(DistanceMeter source) {
        if(source == null) return null;

        final DistanceMeterCommand command = new DistanceMeterCommand();
        command.setId(source.getId());
        command.setEndingZone(source.getEndingZone());
        command.setStringZone(source.getStringZone());
        command.setTotalDistance(source.getTotalDistance());

        return command;
    }
}
