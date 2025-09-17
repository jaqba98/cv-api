package com.olejarczykjakub.cv_api.controller;

import com.olejarczykjakub.cv_api.entity.TechnologyGroup;
import com.olejarczykjakub.cv_api.service.TechnologyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequiredArgsConstructor
@RequestMapping("/technology")
public class TechnologyController {
  private final TechnologyService service;

  @GetMapping("/get-all")
  public ResponseEntity<ArrayList<TechnologyGroup>> getAll() {
    return ResponseEntity.ok().body(service.getAll());
  }
}
