package com.quiz.weather_history.domain;

import java.time.LocalDate;

public class WeatherHistory {
	
				private int id;
				private LocalDate date;
				private String weather;
				private double temperatures;
				private double precipitation;
				private String microDust;
				private double windSpeed;
				private LocalDate createdAt;
				private LocalDate updatedAt;
				
				
				public int getId() {
					return id;
				}
				public void setId(int id) {
					this.id = id;
				}
				public LocalDate getDate() {
					return date;
				}
				public void setDate(LocalDate date) {
					this.date = date;
				}
				public String getWeather() {
					return weather;
				}
				public void setWeather(String weather) {
					this.weather = weather;
				}
				public double getTemperatures() {
					return temperatures;
				}
				public void setTemperatures(double temperatures) {
					this.temperatures = temperatures;
				}
				public double getPrecipitation() {
					return precipitation;
				}
				public void setPrecipitation(double precipitation) {
					this.precipitation = precipitation;
				}
				public String getMicroDust() {
					return microDust;
				}
				public void setMicroDust(String microDust) {
					this.microDust = microDust;
				}
				public double getWindSpeed() {
					return windSpeed;
				}
				public void setWindSpeed(double windSpeed) {
					this.windSpeed = windSpeed;
				}
				public LocalDate getCreatedAt() {
					return createdAt;
				}
				public void setCreatedAt(LocalDate createdAt) {
					this.createdAt = createdAt;
				}
				public LocalDate getUpdatedAt() {
					return updatedAt;
				}
				public void setUpdatedAt(LocalDate updatedAt) {
					this.updatedAt = updatedAt;
				}
				
				
				
				
}
