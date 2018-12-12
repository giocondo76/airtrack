package com.solution.airtrack.Models.Locations;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;

@Entity
@Table(name = "periods")
public class Period {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    @NotEmpty
    @Column(name="period_name", nullable=false)
    private String period_name;

    @NotEmpty
    @Column(name="temp_min", nullable=false)
    private String temp_min;

    @NotEmpty
    @Column(name="temp_max", nullable=false)
    private String temp_max;

    @NotEmpty
    @Column(name="hum_min", nullable=false)
    private String hum_min;

    @NotEmpty
    @Column(name="hum_max", nullable=false)
    private String hum_max;

    @NotEmpty
    @Column(name="co2_min", nullable=false)
    private String co2_min;

    @NotEmpty
    @Column(name="co2_max", nullable=false)
    private String co2_max;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPeriod_name() {
        return period_name;
    }

    public void setPeriod_name(String period_name) {
        this.period_name = period_name;
    }

    public String getTemp_min() {
        return temp_min;
    }

    public void setTemp_min(String temp_min) {
        this.temp_min = temp_min;
    }

    public String getTemp_max() {
        return temp_max;
    }

    public void setTemp_max(String temp_max) {
        this.temp_max = temp_max;
    }

    public String getHum_min() {
        return hum_min;
    }

    public void setHum_min(String hum_min) {
        this.hum_min = hum_min;
    }

    public String getHum_max() {
        return hum_max;
    }

    public void setHum_max(String hum_max) {
        this.hum_max = hum_max;
    }

    public String getCo2_min() {
        return co2_min;
    }

    public void setCo2_min(String co2_min) {
        this.co2_min = co2_min;
    }

    @Override
    public String toString() {
        return "Period{" +
                "id=" + id +
                ", period_name='" + period_name + '\'' +
                ", temp_min='" + temp_min + '\'' +
                ", temp_max='" + temp_max + '\'' +
                ", hum_min='" + hum_min + '\'' +
                ", hum_max='" + hum_max + '\'' +
                ", co2_min='" + co2_min + '\'' +
                ", co2_min='" + co2_min + '\'' +
                '}';
    }
}
