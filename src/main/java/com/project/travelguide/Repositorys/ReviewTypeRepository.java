package com.project.travelguide.Repositorys;

import com.project.travelguide.Models.Rating;
import com.project.travelguide.Models.ReviewType;
import org.springframework.data.repository.CrudRepository;

public interface ReviewTypeRepository extends CrudRepository<ReviewType, Long> {
}
