package com.vineeth.aviationcore.batch;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.vineeth.aviationcore.model.TripDetails;
import com.vineeth.aviationcore.repository.TripDetailRepository;

@Component
public class DBWriter implements ItemWriter<TripDetails> {

	@Autowired
	TripDetailRepository repository;

	@Override
	public void write(List<? extends TripDetails> items) throws Exception {
		for (TripDetails tripDetails : items) {
			repository.save(tripDetails);
		}
	}

}
