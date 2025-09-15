package com.olejarczykjakub.cv_api.repository;

import com.olejarczykjakub.cv_api.entity.Technology;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface TechnologyRepository extends CrudRepository<Technology, Long> {
  Optional<Technology> findByTechnologyName(String technologyName);
}
