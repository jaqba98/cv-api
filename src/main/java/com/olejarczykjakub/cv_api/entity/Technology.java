package com.olejarczykjakub.cv_api.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "technology")
@Data
public class Technology {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
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
    name = "technology_level",
    nullable = false,
    length = 10
  )
  private String technologyLevel;

  @ManyToOne
  @JoinColumn(
    name = "technology_group_id",
    nullable = false
  )
  private TechnologyGroup technologyGroupId;

  @ManyToOne
  @JoinColumn(
    name = "technology_category_id",
    nullable = false
  )
  private TechnologyCategory technologyCategoryId;

  @Column(
    name = "technology_order",
    nullable = false
  )
  private Integer technologyOrder;
}
