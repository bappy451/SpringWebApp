package com.project.travelguide.Repositorys;

import com.project.travelguide.Models.SingUp;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface SignUpRepository extends CrudRepository<SingUp, Long> {
}
