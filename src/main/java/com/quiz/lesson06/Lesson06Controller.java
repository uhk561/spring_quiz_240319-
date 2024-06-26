package com.quiz.lesson06;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Lesson06Controller {
	
	@GetMapping("/lesson06/add-bookmark-view")
	public String addBookmarkView() {
		return "/lesson06/addBookmark";
	}
	
}
