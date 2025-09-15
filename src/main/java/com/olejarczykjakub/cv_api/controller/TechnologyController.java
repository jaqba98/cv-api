package com.olejarczykjakub.cv_api.controller;

import com.olejarczykjakub.cv_api.entity.Technology;
import com.olejarczykjakub.cv_api.request.TechnologyAddRequest;
import com.olejarczykjakub.cv_api.service.TechnologyService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/technology")
public class TechnologyController {
  private final TechnologyService service;

  @PostMapping("/add")
  public ResponseEntity<String> add(@RequestBody TechnologyAddRequest technology) {
    val technologyName = technology.technologyName();
    val technologyGroup = technology.technologyGroup();
    val technologyLevel = technology.technologyLevel();
    val error = service.add(technologyName, technologyGroup, technologyLevel);
    return error.isEmpty()
      ? ResponseEntity.ok().body("The new technology was added!")
      : ResponseEntity.badRequest().body("Failed to add new technology: " + error);
  }

  @GetMapping("/get-all")
  public ResponseEntity<ArrayList<Technology>> getAll() {
    return ResponseEntity.ok().body(service.getAll());
  }
}
