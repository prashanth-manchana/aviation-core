package com.vineeth.aviationcore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vineeth.aviationcore.model.ParametersData;
import com.vineeth.aviationcore.model.Passengers;

public interface TripDetailRepository extends JpaRepository<Passengers, Integer> {

	void save(ParametersData parameters);

}
