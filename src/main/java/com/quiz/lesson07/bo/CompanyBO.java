package com.quiz.lesson07.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.lesson07.entity.CompanyEntity;
import com.quiz.lesson07.repository.CompanyRepository;

@Service
public class CompanyBO {

	@Autowired
	private CompanyRepository companyRepostiory;
	
	//  input: 4개 파라미터
	// output: CompanyEntity
	
	public CompanyEntity addCompany(String name, String business, String scale, int headcount) {
		CompanyEntity company = CompanyEntity.builder()
				.name(name)
				.business(business)
				.scale(scale)
				.headcount(headcount)
				.build();
		
		return companyRepository.save(company);
	}
}
