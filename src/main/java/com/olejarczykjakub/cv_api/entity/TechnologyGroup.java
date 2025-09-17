package com.olejarczykjakub.cv_api.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "technology_group")
@Data
public class TechnologyGroup {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(
    name = "technology_group_id",
    nullable = false,
    unique = true,
    updatable = false
  )
  private Long technologyGroupId;

  @Column(
    name = "technology_group_name",
    nullable = false,
    length = 100
  )
  private String technologyGroupName;

  @Column(
    name = "technology_group_order",
    nullable = false
  )
  private Integer technologyGroupOrder;
}
