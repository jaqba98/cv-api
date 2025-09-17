package com.olejarczykjakub.cv_api.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "technology_category")
@Data
public class TechnologyCategory {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(
    name = "technology_category_id",
    nullable = false,
    unique = true,
    updatable = false
  )
  private Long technologyCategoryId;

  @Column(
    name = "technology_category_name",
    nullable = false,
    length = 100
  )
  private String technologyCategoryName;

  @Column(
    name = "technology_category_order",
    nullable = false
  )
  private Integer technologyCategoryOrder;

  @ManyToOne
  @JoinColumn(
    name = "technology_group_id",
    nullable = false
  )
  private TechnologyGroup technologyGroupId;
}
