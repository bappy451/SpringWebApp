package com.project.travelguide.Commands;

import com.project.travelguide.Models.Food;

import javax.persistence.CascadeType;
import javax.persistence.OneToOne;

public class FoodTypeCommand {
    private Long id;
    private Food food;
    private String foodName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }
}
