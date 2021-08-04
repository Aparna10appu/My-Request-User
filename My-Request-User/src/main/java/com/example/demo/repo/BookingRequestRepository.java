package com.example.demo.repo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.example.demo.entity.BookingRequestBO;
import com.example.demo.entity.TripCabInfo;



public interface BookingRequestRepository extends MongoRepository<BookingRequestBO, Long> {

	//List<BookingRequestBO> findRequestDetailsByDateAndTimeslotAndStatus(LocalDateTime date, LocalTime timeslot, String status);
//List<BookingRequestBO> findByEmployeeId(int employeeId);
	List<BookingRequestBO> findByTripCabId(long tripCabId);

	@Query(value = "{employeeId : ?0 , status:{$nin : [Assigned,InProgress]}}")  
	List<BookingRequestBO> getCompletedTripDetails(String employeeId);

}
