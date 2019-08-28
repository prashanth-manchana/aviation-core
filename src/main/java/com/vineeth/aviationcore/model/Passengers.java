package com.vineeth.aviationcore.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Passengers {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int passengerId;

	private String passengerRefId;

	private String metaData;

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<FlightPassengerSegment> flightPassengerSegment;

	public String getPassengerRefId() {
		return passengerRefId;
	}

	public void setPassengerRefId(String passengerRefId) {
		this.passengerRefId = passengerRefId;
	}

	public String getMetaData() {
		return metaData;
	}

	public void setMetaData(String metaData) {
		this.metaData = metaData;
	}

	public List<FlightPassengerSegment> getFlightPassengerSegment() {
		return flightPassengerSegment;
	}

	public void setFlightPassengerSegment(List<FlightPassengerSegment> flightPassengerSegment) {
		this.flightPassengerSegment = flightPassengerSegment;
	}

	@Override
	public String toString() {
		return "Passengers [passengerRefId=" + passengerRefId + ", metaData=" + metaData + ", flightPassengerSegment="
				+ flightPassengerSegment + "]";
	}

}
