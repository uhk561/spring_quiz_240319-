package com.quiz.lesson04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.quiz.lesson04.bo.RealtorBO;
import com.quiz.lesson04.domain.Realtor;

@RequestMapping("/lesson04/quiz02")
@Controller
public class Lesson04Quiz02Controller {
	
	@Autowired
	private RealtorBO realtorBO;

	// lesson04/quiz02/add-realtor-view
	@GetMapping("/add-realtor-view")
	public String addRealtorView() {
		return "lesson04/addRealtor";
		
		}
		@PostMapping("/add-Realtor")
		public String addRealtor(
				@ModelAttribute Realtor realtor,
				Model model) {
			
			// DB insert
			realtorBO.addRealtor(realtor);
			
			// DB select => 
			int id = realtor.getId();
			Realtor newRealtor = realtorBO.getRealtorById(id);
			
			// Model에 담는다. 
			model.addAttribute("realtor", newRealtor);
			
			// 화면 이동
			return "lesson04/afterAddRealtor";
		}
	}

