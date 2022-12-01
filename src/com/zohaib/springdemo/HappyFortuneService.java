package com.zohaib.springdemo;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today you are going to win";
	}

}
