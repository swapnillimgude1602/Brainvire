package com.example.demo.Model;

import java.util.HashSet;
import java.util.Set;

import com.example.demo.DTO.Size;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "title")
	private String title;

	@Column(name = "description")
	private String description;

	@Column(name = "price")
	private int price;

	@Column(name = "discountedPrice")
	private int discountedPrice;

	@Column(name = "discountPercent")
	private int discountPercent;

	@Column(name = "quantity")
	private int quantity;

	@Column(name = "brand")
	private String brand;

	@Column(name = "color")
	private String color;

	@Column(name = "image_url")
	private String imageUrl;

	@Column(name = "num_Ratrings")
	private int numRatrings;

	@ManyToOne
	@JoinColumn(name = "category_id")
	private Category category;
	
	@Embedded
	@ElementCollection
	@Column(name = "size")
	private Set<Size> sizes = new HashSet<>();

}
