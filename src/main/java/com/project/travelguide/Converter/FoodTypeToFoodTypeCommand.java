package com.project.travelguide.Converter;

import com.project.travelguide.Commands.FoodTypeCommand;
import com.project.travelguide.Models.FoodType;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class FoodTypeToFoodTypeCommand implements Converter<FoodType, FoodTypeCommand> {
    @Override
    public FoodTypeCommand convert(FoodType source) {
        if(source == null)return null;

        final FoodTypeCommand command = new FoodTypeCommand();
        command.setId(source.getId());
        command.setFood(source.getFood());
        command.setFoodName(source.getFoodName());

        return command;
    }
}
