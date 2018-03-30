package com.project.travelguide.Converter;

import com.project.travelguide.Commands.FoodCommand;
import com.project.travelguide.Models.Food;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class FoodToFoodCommand implements Converter<Food,FoodCommand> {

    @Override
    public FoodCommand convert(Food source) {
        if(source == null) return null;

        final FoodCommand command = new FoodCommand();
        command.setId(source.getId());
        command.setFoodTypeId(source.getFoodTypeId());
        command.setPlaceDetails(source.getPlaceDetails());
        command.setPriceRange(source.getPriceRange());

        return command;
    }
}
