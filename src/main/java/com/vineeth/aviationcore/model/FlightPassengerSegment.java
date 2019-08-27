package com.vineeth.aviationcore.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class FlightPassengerSegment {
	@Id
	private int id;
	private String flightNumber;
	private String carrierCode;
	private String offPoint;
	private String boardPoint;
	private String departureUTC;
	private String arrivalUTC;
	private String terminal;
	private String gateNumber;
	private String carrierName;
	private String arrivalPlace;

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

	public String getOffPoint() {
		return offPoint;
	}

	public void setOffPoint(String offPoint) {
		this.offPoint = offPoint;
	}

	public String getBoardPoint() {
		return boardPoint;
	}

	public void setBoardPoint(String boardPoint) {
		this.boardPoint = boardPoint;
	}

	public String getDepartureUTC() {
		return departureUTC;
	}

	public void setDepartureUTC(String departureUTC) {
		this.departureUTC = departureUTC;
	}

	public String getArrivalUTC() {
		return arrivalUTC;
	}

	public void setArrivalUTC(String arrivalUTC) {
		this.arrivalUTC = arrivalUTC;
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

	public String getCarrierName() {
		return carrierName;
	}

	public void setCarrierName(String carrierName) {
		this.carrierName = carrierName;
	}

	public String getArrivalPlace() {
		return arrivalPlace;
	}

	public void setArrivalPlace(String arrivalPlace) {
		this.arrivalPlace = arrivalPlace;
	}

	@Override
	public String toString() {
		return "FlightPassengerSegment [id=" + id + ", flightNumber=" + flightNumber + ", carrierCode=" + carrierCode
				+ ", offPoint=" + offPoint + ", boardPoint=" + boardPoint + ", departureUTC=" + departureUTC
				+ ", arrivalUTC=" + arrivalUTC + ", terminal=" + terminal + ", gateNumber=" + gateNumber
				+ ", carrierName=" + carrierName + ", arrivalPlace=" + arrivalPlace + "]";
	}

}
