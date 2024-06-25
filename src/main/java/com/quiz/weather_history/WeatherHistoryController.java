package com.quiz.weather_history;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.quiz.weather_history.bo.WeatherHistoryBO;
import com.quiz.weather_history.domain.WeatherHistory;

@RequestMapping("/weather-history")
@Controller
public class WeatherHistoryController {

	@Autowired
	private WeatherHistoryBO weatherhistoryBO;
		
	@GetMapping("/weather-list-view")
	public String weatherHistoryListView(Model model) {
		// select db
		List<WeatherHistory> weatherHistoryList = WeatherHistoryBO
		// model
		
		// 화면 이동
		return "/weather_history/weatherList";
	}
	
	
	@GetMapping("/add-weather-view")
	public String addWeatherView() {
		return "weather_history/addWeather";
	}
	
	
	
	// 날씨 추가 기능 /weather-history/add-weather
	@PostMapping("/add-weather")
	public String addWeather(
			@RequestParam("date") ) {
		
	}
}
