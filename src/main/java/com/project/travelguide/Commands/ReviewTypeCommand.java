package com.project.travelguide.Commands;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ReviewTypeCommand {
    private Long id;
    private String reviewType;
    private String reviewTypeDetails;
}
