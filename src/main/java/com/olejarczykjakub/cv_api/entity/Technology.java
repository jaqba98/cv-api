package com.olejarczykjakub.cv_api.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Technology {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  // todo: Set up the @Column here because now there is only name
  @Column(name = "technology_id")
  private Long technologyId;

  // todo: Set up the @Column here because now there is only name
  @Column(name = "technology_name")
  private String technologyName;

  // todo: Set up the @Column here because now there is only name
  @Column(name = "technology_group")
  private String technologyGroup;
}
