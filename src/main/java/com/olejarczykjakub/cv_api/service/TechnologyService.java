package com.olejarczykjakub.cv_api.service;

import com.olejarczykjakub.cv_api.entity.Technology;
import com.olejarczykjakub.cv_api.repository.TechnologyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TechnologyService {
    private final TechnologyRepository repository;

    @Autowired
    public TechnologyService(TechnologyRepository repository) {
        this.repository = repository;
    }

    public void addTechnology(String technologyName, String technologyGroup) {
        Technology technology = new Technology(technologyName, technologyGroup);
        repository.save(technology);
    }

    public ArrayList<Technology> getTechnologies() {
        return (ArrayList<Technology>) repository.findAll();
    }
}
