package com.solution.airtrack.Models.Devices;

import javax.persistence.*;

@Entity
@Table(name="devices")
public class Device {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "devType_id", nullable = false)
    private DeviceType devType_id;

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

    public DeviceType getDevType_id() {
        return devType_id;
    }

    public void setDevType_id(DeviceType devType_id) {
        this.devType_id = devType_id;
    }


}
