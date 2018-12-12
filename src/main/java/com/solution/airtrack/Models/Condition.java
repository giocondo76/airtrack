package com.solution.airtrack.Models;

import com.solution.airtrack.Models.Devices.Device;
import com.solution.airtrack.Models.Locations.Location;

import javax.persistence.*;

@Entity
@Table(name = "conditions")
public class Condition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "dev_id", nullable = false)
    private Device dev_id;

    @ManyToOne
    @JoinColumn(name = "loc_id", nullable = false)
    private Location loc_id;

    @Column(name = "temp", nullable = false)
    private String temp;

    @Column(name = "hum", nullable = false)
    private String hum;

    @Column(name = "co2", nullable = false)
    private String co2;

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

    public Device getDev_id() {
        return dev_id;
    }

    public void setDev_id(Device dev_id) {
        this.dev_id = dev_id;
    }

    public Location getLoc_id() {
        return loc_id;
    }

    public void setLoc_id(Location loc_id) {
        this.loc_id = loc_id;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getHum() {
        return hum;
    }

    public void setHum(String hum) {
        this.hum = hum;
    }

    public String getCo2() {
        return co2;
    }

    public void setCo2(String co2) {
        this.co2 = co2;
    }

    @Override
    public String toString() {
        return "Condition{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dev_id=" + dev_id +
                ", loc_id=" + loc_id +
                ", temp='" + temp + '\'' +
                ", hum='" + hum + '\'' +
                ", co2='" + co2 + '\'' +
                '}';
    }
}
