package com.vineeth.aviationcore.batch;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.vineeth.aviationcore.model.Passengers;
import com.vineeth.aviationcore.model.TripDetails;

@Component
public class Processor implements ItemProcessor<TripDetails, TripDetails> {

	@Override
	public TripDetails process(TripDetails item) throws Exception {
		System.out.println("Processor process");
		System.out.println("Processor" + item.toString());
		manipulateData(item);
//		throwExceptionBlock();
		return item;
	}

	private void manipulateData(TripDetails item) {
		item.setFlightNumber(item.getFlightNumber().concat("65432"));

		for (Passengers passenger : item.getPassengers()) {
			passenger.getFlightPassengerSegment().get(0).getCarrierCode().concat("1234");
		}

	}

	private void throwExceptionBlock() {
		throw new RuntimeException();
	}

}
