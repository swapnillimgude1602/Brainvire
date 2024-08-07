package com.example.demo.Entiy;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Hotel {

	private String hotelId;
	private String hotelName;
	private String hotelLocation;
	private String hotelAbout;
}
