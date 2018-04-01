package com.project.travelguide.Commands;

import com.project.travelguide.Models.Food;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.OneToOne;

@Getter
@Setter
@NoArgsConstructor
public class FoodTypeCommand {
    private Long id;
    private Food food;
    private String foodName;
}
