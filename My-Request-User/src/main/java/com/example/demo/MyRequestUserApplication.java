package com.example.demo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.BookingRequestBO;
import com.example.demo.entity.TripCabInfo;
import com.example.demo.repo.BookingRequestRepository;
import com.example.demo.repo.TripCabRepository;



@SpringBootApplication
public class MyRequestUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyRequestUserApplication.class, args);
	}
	
	
 @Bean
	public CommandLineRunner runner()
	{
		return new CommandLineRunner() {
			
			@Autowired
			BookingRequestRepository bookingrepo;
			
			@Autowired
			TripCabRepository triprepo;
		
			
			@Override
			public void run(String... args) throws Exception {
			
				BookingRequestBO details = new BookingRequestBO(1,2038,"Nive","Alphacity","Tambaram","Bharath university",LocalDateTime.now(),LocalTime.of(10, 30),0,1031,null,null,null,null,"reached",null,null,null,null,0);
				this.bookingrepo.save(details);
				
				BookingRequestBO details1 = new BookingRequestBO(2,2038,"Nive","Alphacity","ChennaiEgmore","Bharath university",LocalDateTime.now(),LocalTime.of(10, 30),0,1038,null,null,null,null,"cancelled",null,null,null,null,0);
				this.bookingrepo.save(details1);
				
				//BookingRequestBO details2 = new BookingRequestBO(3,2034,"Nive","Alphacity","Central","Bharath university",LocalDateTime.now(),LocalTime.of(10, 30),0,1050,null,null,null,null,"reached",null,null,null,null,0);
				//this.bookingrepo.save(details2);
		
		TripCabInfo trip1 = new TripCabInfo(1031, "TN10jkaxj", 123, "AlphaCity", "Destination", "Doller", LocalDate.now(), LocalTime.now(), 12, 2, 10, "Reached", LocalTime.of(8, 0), LocalTime.of(10, 0));
				triprepo.save(trip1);
				TripCabInfo trip2 = new TripCabInfo(1038, "TN10jkaxj", 123, "AlphaCity", "Destination", "Doller", LocalDate.now(), LocalTime.now(), 12, 2, 10, "Reached", LocalTime.of(8, 0), LocalTime.of(10, 0));
				triprepo.save(trip2);
				
			}	};
}}