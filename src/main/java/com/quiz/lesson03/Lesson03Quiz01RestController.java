package com.quiz.lesson03;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.lesson03.bo.RealEstateBO;
import com.quiz.lesson03.domain.RealEstate;

@RestController
public class Lesson03Quiz01RestController {
	
	@Autowired
	private RealEstateBO realestateBO;
	
	@RequestMapping("/lesson03/quiz01/1")
	public RealEstate quiz01_1(
			@RequestParam("id") int id
			) {
		
		return realestateBO.getRealEstateById(id);
	}
	@RequestMapping("/lesson03/quiz01/2")
	public RealEstate quiz01_2(
			@RequestParam("rent_price") int rentPrice
			) {
		
		return realestateBO.getRealEstateByRentPrice(rentPrice);
	}
	
}
