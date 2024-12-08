package com.fintrack.FinTrack.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fintrack.FinTrack.entity.Investment;

@Repository
public interface InvestmentRepository extends CrudRepository<Investment, String> {

}
