package com.example.demo.BO;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.entity.BookingRequestBO;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Component

public class RequestBO {

	BookingRequestBO details;
	LocalDate dateOfTravel;
	
}
