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
public class TripDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int tripId;

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Passengers> passengers;

	private String terminal;
	private String gateNumber;
	private String flightNumber;
	private String carrierCode;

	public List<Passengers> getPassengers() {
		return passengers;
	}

	public void setPassengerDetailsTO(List<Passengers> passengers) {
		this.passengers = passengers;
	}

	public String getTerminal() {
		return terminal;
	}

	public void setTerminal(String terminal) {
		this.terminal = terminal;
	}

	public String getGateNumber() {
		return gateNumber;
	}

	public void setGateNumber(String gateNumber) {
		this.gateNumber = gateNumber;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getCarrierCode() {
		return carrierCode;
	}

	public void setCarrierCode(String carrierCode) {
		this.carrierCode = carrierCode;
	}

	@Override
	public String toString() {
		return "TripDetails [tripId=" + tripId + ", passengers=" + passengers + ", terminal=" + terminal
				+ ", gateNumber=" + gateNumber + ", flightNumber=" + flightNumber + ", carrierCode=" + carrierCode
				+ "]";
	}

}
