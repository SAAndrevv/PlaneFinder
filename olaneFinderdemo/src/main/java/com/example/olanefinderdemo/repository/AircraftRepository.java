package com.example.olanefinderdemo.repository;

import com.example.olanefinderdemo.model.Aircraft;
import org.springframework.data.repository.CrudRepository;

public interface AircraftRepository extends CrudRepository<Aircraft, Long> {
}
