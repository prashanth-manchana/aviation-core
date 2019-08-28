package com.vineeth.aviationcore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vineeth.aviationcore.model.TripDetails;

public interface TripDetailRepository extends JpaRepository<TripDetails, Integer> {

}
