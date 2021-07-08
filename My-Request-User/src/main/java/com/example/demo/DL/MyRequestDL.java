package com.example.demo.DL;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.BO.BookingDetailsBO;
import com.example.demo.BO.RequestBO;
import com.example.demo.entity.BookingRequestBO;
import com.example.demo.entity.TripCabInfo;
import com.example.demo.repo.BookingRequestRepository;
import com.example.demo.repo.TripCabRepository;

@Component
public class MyRequestDL {
	
	@Autowired
	private BookingRequestRepository bookingrepo;
	
	@Autowired
	private TripCabRepository triprepo;

  
	public  List<RequestBO>  getHistoryOfTrips(int employeeId) {
        List<RequestBO> resultobj= new ArrayList<RequestBO>();
		List<BookingRequestBO> details =this.bookingrepo.getCompletedTripDetails(employeeId);
		 for(BookingRequestBO eachRequest:details) {
			 resultobj.add(new RequestBO(eachRequest,getDateOfTravel(eachRequest.getTripCabId())));
		 }
		 
		 return resultobj;
	}
		 
	private LocalDate getDateOfTravel(long tripID) {

		TripCabInfo tripInfoObj = triprepo.findByTripCabId(tripID);
		return tripInfoObj.getDateOfTravel();

	}
		   
		//return this.triprepo.findByTripCabId(tripCabId);
	}



//	    public List<BookingRequest> getEmployeeDetails(String status) {
//	        
//	        return this.bookingRepo.findEmployeeDetailsByStatus(status);
//	    }
	// 






	


