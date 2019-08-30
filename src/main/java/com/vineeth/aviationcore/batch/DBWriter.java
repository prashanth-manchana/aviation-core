package com.vineeth.aviationcore.batch;

import java.util.List;

import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.vineeth.aviationcore.model.ParametersData;
import com.vineeth.aviationcore.model.TripDetails;
import com.vineeth.aviationcore.repository.ParametersRepository;
import com.vineeth.aviationcore.repository.TripDetailRepository;

@Component
@StepScope
public class DBWriter implements ItemWriter<TripDetails> {

	@Autowired
	TripDetailRepository repository;
	
	@Autowired
	ParametersRepository paramsRepo;
	
	@Value("#{jobParameters['filename']}")
	private String fileName;

	@Override
	public void write(List<? extends TripDetails> items) throws Exception {
		System.out.println("fileName ===========" + fileName);
		ParametersData parameters = new ParametersData();
		parameters.setFileLocation(fileName);
		paramsRepo.save(parameters);
		for (TripDetails tripDetails : items) {
			repository.save(tripDetails);
		}
	}

}
