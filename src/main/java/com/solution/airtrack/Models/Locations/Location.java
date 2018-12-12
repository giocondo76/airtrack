package com.solution.airtrack.Models.Locations;

import com.solution.airtrack.Models.Devices.DeviceType;

import javax.persistence.*;
@Entity
@Table(name = "locations")
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "locType_id", nullable = false)
    private DeviceType locType_id;

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

    public DeviceType getLocType_id() {
        return locType_id;
    }

    public void setLocType_id(DeviceType locType_id) {
        this.locType_id = locType_id;
    }

    @Override
    public String toString() {
        return "Location{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", locType_id=" + locType_id +
                '}';
    }
}
