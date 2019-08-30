package com.vineeth.aviationcore.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TripDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int tripId;

	private String terminal;
	private String gateNumber;
	private String flightNumber;
	private String carrierCode;

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

}
