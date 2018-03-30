package com.project.travelguide.Converter;

import com.project.travelguide.Commands.ZoneDetailsCommand;
import com.project.travelguide.Models.ZoneDetails;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class ZoneDetailsCommandToZoneDetails implements Converter<ZoneDetailsCommand,ZoneDetails> {
    @Override
    public ZoneDetails convert(ZoneDetailsCommand source) {
        if(source == null)return null;
        final ZoneDetails zoneDetails = new ZoneDetails();
        zoneDetails.setPlaceDetails(source.getPlaceDetails());
        zoneDetails.setPlaceName(source.getPlaceName());
        zoneDetails.setId(source.getId());

        return zoneDetails;
    }
}
