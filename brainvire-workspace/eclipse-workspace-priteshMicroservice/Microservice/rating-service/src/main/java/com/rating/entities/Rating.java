package com.rating.entities;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document("ratings")
public class Rating {
	@Id
	private Long ratingId;
	private Long userId;
	private Long hotelId;
	private int rating;
	private String feedback;
}
