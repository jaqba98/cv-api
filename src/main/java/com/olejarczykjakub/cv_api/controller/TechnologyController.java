package com.olejarczykjakub.cv_api.controller;

import com.olejarczykjakub.cv_api.service.TechnologyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TechnologyController {
    private final TechnologyService service;

    @Autowired
    public TechnologyController(TechnologyService service) {
        this.service = service;
    }

    @GetMapping("/add")
    public String addTechnology(@RequestParam String technologyName, @RequestParam String technologyGroup) {
        service.addTechnology(technologyName, technologyGroup);
        return "The technology was added!";
    }

    @GetMapping("/get")
    public String getTechnology() {
        final String[] technologies = {""};
        service.getTechnologies().forEach(technology -> {
            technologies[0] += technology.getTechnologyName() + ", " + technology.getTechnologyGroup() + "\n";
        });
        return technologies[0];
    }
}
