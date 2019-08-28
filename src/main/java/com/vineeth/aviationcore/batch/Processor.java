package com.vineeth.aviationcore.batch;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.vineeth.aviationcore.model.TripDetails;

@Component
public class Processor implements ItemProcessor<TripDetails, TripDetails> {

	@Override
	public TripDetails process(TripDetails item) throws Exception {
		System.out.println("Processor process");
		System.out.println("Processor" + item.toString());
		return item;
	}

}
