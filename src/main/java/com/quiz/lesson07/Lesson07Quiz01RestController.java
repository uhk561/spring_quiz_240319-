package com.quiz.lesson07;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.lesson07.bo.CompanyBO;
import com.quiz.lesson07.entity.CompanyEntity;

@RequestMapping("/lesson07/quiz01")
@RestController
public class Lesson07Quiz01RestController {
	
	@Autowired
	private CompanyBO companyBo;
	
	@GetMapping("/save1")
	public CompanyEntity save1() {
		
		String name = "넥손";
		String business = "컨텐츠게임";
		String scale = "대기업";
		int headcount = 3585;
		
	return companyBo.addCompany(name, business, scale, headcount);
	}
}
