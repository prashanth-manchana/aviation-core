package com.vineeth.aviationcore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vineeth.aviationcore.model.ParametersData;

public interface ParametersRepository extends JpaRepository<ParametersData, Integer> {

}
