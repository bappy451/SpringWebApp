package com.project.travelguide.Converter;

import com.project.travelguide.Commands.ZoneDetailsCommand;
import com.project.travelguide.Models.ZoneDetails;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class ZoneDetailsToZoneDetailsCommand implements Converter<ZoneDetails,ZoneDetailsCommand> {
    @Override
    public ZoneDetailsCommand convert(ZoneDetails source) {
        if(source == null)return null;
        final ZoneDetailsCommand command = new ZoneDetailsCommand();
        command.setPlaceDetails(source.getPlaceDetails());
        command.setPlaceName(source.getPlaceName());
        command.setId(source.getId());

        return command;
    }
}
