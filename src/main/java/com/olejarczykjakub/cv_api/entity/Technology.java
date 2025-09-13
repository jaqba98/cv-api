package com.olejarczykjakub.cv_api.entity;

import jakarta.persistence.*;

@Entity
public class Technology {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "technology_id")
    private Long technologyId;

    @Column(name = "technology_name")
    private String technologyName;

    @Column(name = "technology_group")
    private String technologyGroup;

    protected Technology() {
    }

    public Technology(String technologyName, String technologyGroup) {
        this.technologyName = technologyName;
        this.technologyGroup = technologyGroup;
    }

    public String getTechnologyName() {
        return technologyName;
    }

    public void setTechnologyName(String technologyName) {
        this.technologyName = technologyName;
    }

    public String getTechnologyGroup() {
        return technologyGroup;
    }

    public void setTechnologyGroup(String technologyGroup) {
        this.technologyGroup = technologyGroup;
    }
}
