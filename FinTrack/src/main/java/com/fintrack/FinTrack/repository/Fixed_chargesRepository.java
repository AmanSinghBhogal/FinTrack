package com.fintrack.FinTrack.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fintrack.FinTrack.entity.Fixed_charges;

@Repository
public interface Fixed_chargesRepository extends CrudRepository<Fixed_charges, String> {

}
