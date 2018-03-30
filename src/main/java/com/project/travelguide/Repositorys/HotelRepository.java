package com.project.travelguide.Repositorys;

import com.project.travelguide.Models.Hotels;
import org.springframework.data.repository.CrudRepository;

public interface HotelRepository extends CrudRepository<Hotels,Long> {
}
