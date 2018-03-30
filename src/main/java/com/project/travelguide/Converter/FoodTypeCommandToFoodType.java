package com.project.travelguide.Converter;

import com.project.travelguide.Commands.FoodTypeCommand;
import com.project.travelguide.Models.FoodType;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class FoodTypeCommandToFoodType implements Converter<FoodTypeCommand,FoodType>{

    @Override
    public FoodType convert(FoodTypeCommand source) {
        if(source == null) return null;

        final FoodType foodType = new FoodType();
        foodType.setId(source.getId());
        foodType.setFood(source.getFood());
        foodType.setFoodName(source.getFoodName());

        return foodType;
    }
}
