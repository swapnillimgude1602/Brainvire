package com.example.demo.Entiy;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserRating {
	private String ratingId;
	private String userId;
	private String hotelId;
	private int rating;
	private String feedback;

	private Hotel hotel;
}
