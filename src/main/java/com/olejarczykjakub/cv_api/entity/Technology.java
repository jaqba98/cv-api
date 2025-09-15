package com.olejarczykjakub.cv_api.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Technology {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(
    name = "technology_id",
    nullable = false,
    unique = true,
    updatable = false
  )
  private Long technologyId;

  @Column(
    name = "technology_name",
    nullable = false,
    unique = true,
    length = 50
  )
  private String technologyName;

  @Column(
    name = "technology_group",
    nullable = false,
    length = 50
  )
  private String technologyGroup;

  @Column(
    name = "technology_level",
    nullable = false,
    length = 10
  )
  private String technologyLevel;
}
