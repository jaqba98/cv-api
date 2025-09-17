package com.olejarczykjakub.cv_api.service;

import com.olejarczykjakub.cv_api.entity.TechnologyGroup;
import com.olejarczykjakub.cv_api.repository.TechnologyCategoryRepository;
import com.olejarczykjakub.cv_api.repository.TechnologyGroupRepository;
import com.olejarczykjakub.cv_api.repository.TechnologyRepository;
import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class TechnologyService {
  private final TechnologyRepository technologyRepository;
  private final TechnologyGroupRepository technologyGroupRepository;
  private final TechnologyCategoryRepository technologyCategoryRepository;

  public ArrayList<TechnologyGroup> getAll() {
    val technologyGroup = technologyGroupRepository.findAll();
    val technologyCategory = technologyCategoryRepository.findAll();
    val technology = technologyRepository.findAll();
    return (ArrayList<TechnologyGroup>) technologyGroup;
  }
}
