package com.project.travelguide.Models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Setter
@Getter
public class DistanceMeter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String stringZone;
    private String endingZone;
    private String totalDistance;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStringZone() {
        return stringZone;
    }

    public void setStringZone(String stringZone) {
        this.stringZone = stringZone;
    }

    public String getEndingZone() {
        return endingZone;
    }

    public void setEndingZone(String endingZone) {
        this.endingZone = endingZone;
    }

    public String getTotalDistance() {
        return totalDistance;
    }

    public void setTotalDistance(String totalDistance) {
        this.totalDistance = totalDistance;
    }
}
