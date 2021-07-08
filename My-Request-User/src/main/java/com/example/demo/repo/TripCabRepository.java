package com.example.demo.repo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.entity.TripCabInfo;

public interface TripCabRepository extends MongoRepository<TripCabInfo, Long> {
TripCabInfo findByTripCabId(long tripCabId);
	  
}
