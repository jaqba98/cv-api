package com.olejarczykjakub.cv_api.service;

import com.olejarczykjakub.cv_api.entity.Technology;
import com.olejarczykjakub.cv_api.repository.TechnologyRepository;
import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class TechnologyService {
  private final TechnologyRepository repository;

  public String add(String technologyName, String technologyGroup, String technologyLevel) {
    try {
      val technology = new Technology();
      technology.setTechnologyName(technologyName);
      technology.setTechnologyGroup(technologyGroup);
      technology.setTechnologyLevel(technologyLevel);
      repository.save(technology);
      return "";
    } catch (Exception e) {
      return e.getMessage();
    }
  }

  public ArrayList<Technology> getAll() {
    return (ArrayList<Technology>) repository.findAll();
  }
}
