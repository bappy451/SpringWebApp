package com.project.travelguide.Converter;

import com.project.travelguide.Commands.FoodCommand;
import com.project.travelguide.Models.Food;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class FoodCommandToFood implements Converter<FoodCommand, Food> {
    @Override
    public Food convert(FoodCommand source) {
        if(source == null) return null;

        final Food food = new Food();
        food.setId(source.getId());
        food.setFoodTypeId(source.getFoodTypeId());
        food.setPlaceDetails(source.getPlaceDetails());
        food.setPriceRange(source.getPriceRange());

        return food;
    }
}
