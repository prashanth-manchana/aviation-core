package com.vineeth.aviationcore.batch;

import java.util.List;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.vineeth.aviationcore.model.FlightPassengerSegment;
import com.vineeth.aviationcore.model.Passengers;

@Component
public class Processor implements ItemProcessor<Passengers, Passengers> {

	@Override
	public Passengers process(Passengers passengers) throws Exception {
		System.out.println("Processor" + passengers.toString());
		manipulateData(passengers);
//		throwExceptionBlock();
		return passengers;
	}

	private void manipulateData(Passengers passengers) {
		List<FlightPassengerSegment> segments = passengers.getFlightPassengerSegment();
		for (FlightPassengerSegment flightPassengerSegment : segments) {
			flightPassengerSegment.getFlightNumber().concat("1245");
		}
	}

	private void throwExceptionBlock() {
		throw new RuntimeException();
	}

}
