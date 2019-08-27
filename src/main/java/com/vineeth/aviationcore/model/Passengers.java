package com.vineeth.aviationcore.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Passengers {
	@Id
	private String passengerRefId;
	private String metaData;
	@OneToMany(targetEntity = FlightPassengerSegment.class)
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
