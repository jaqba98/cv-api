package com.olejarczykjakub.cv_api.controller;

import com.olejarczykjakub.cv_api.entity.Technology;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class TechnologyController {
    @GetMapping("/technology")
    public ResponseEntity<ArrayList<Technology>> getTechnology() {
        var technology = new ArrayList<Technology>();
        technology.add(new Technology("xml", "be"));
        return ResponseEntity.ok().body(technology);
    }
}
