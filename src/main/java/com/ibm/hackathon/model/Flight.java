package com.ibm.hackathon.model;

import javax.persistence.*;

@Entity
@Table(name="flight_master")
public class Flight {
    @Id
    @Column(name="flight_uid") @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long flightUid;

    @Column(name="flight_id")
    private String flightId;

    @Column(name="flight_name")
    private String flightName;

    @Column(name="flight_type")
    private String flightType;

    @Column(name="seats")
    private Integer seats;

    public Flight() {
    }

    public Long getFlightUid() {
        return flightUid;
    }

    public void setFlightUid(Long flightUid) {
        this.flightUid = flightUid;
    }

    public String getFlightId() {
        return flightId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public String getFlightName() {
        return flightName;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    public String getFlightType() {
        return flightType;
    }

    public void setFlightType(String flightType) {
        this.flightType = flightType;
    }

    public Integer getSeats() {
        return seats;
    }

    public void setSeats(Integer seats) {
        this.seats = seats;
    }
}
