package com.solution.airtrack.Models.Locations;

import javax.persistence.*;
@Entity
@Table(name = "location_type")
public class LocationType{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "period_id", nullable = false)
    private Period period_id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Period getPeriod_id() {
        return period_id;
    }

    public void setPeriod_id(Period period_id) {
        this.period_id = period_id;
    }

    @Override
    public String toString() {
        return "LocationType{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", period_id=" + period_id +
                '}';
    }
}
