package com.project.travelguide.Commands;

public class DistanceMeterCommand {

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
