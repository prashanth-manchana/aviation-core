package com.vineeth.aviationcore.batch;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.stereotype.Component;

import com.vineeth.aviationcore.model.TripDetails;

@Component
public class DBWriter implements ItemWriter<TripDetails> {

	@Override
	public void write(List<? extends TripDetails> items) throws Exception {
		System.out.println("DBWrite Write");
		System.out.println("DBWriter : " + items);
	}

}
