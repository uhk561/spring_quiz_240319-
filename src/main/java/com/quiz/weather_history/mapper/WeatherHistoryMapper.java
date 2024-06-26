package com.quiz.weather_history.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

import com.quiz.weather_history.domain.WeatherHistory;

@Mapper
public interface WeatherHistoryMapper {

	public List<WeatherHistory> selectWeatherHistoryList();
	
	public int insertWeatherHistory(
			@Param("date") String date,
			@Param("weather") String weather,
			@Param("microDust") String microDust,
			@Param("temperatures") double temperatures,
			@Param("windSpeed") double windSpeed 
			);
	
}