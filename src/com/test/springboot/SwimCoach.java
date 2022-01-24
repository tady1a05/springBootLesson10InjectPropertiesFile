package com.test.springboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class SwimCoach implements Coach {
	private LuckA luckA;
	
	@Value("${name}")
	private String name;
	
	@Value("${email}")
	private String email;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LuckA getLuckA() {
		return luckA;
	}

	public void setLuckA(LuckA luckA) {
		this.luckA = luckA;
	}
	
	public SwimCoach(LuckA luckA) {
		this.luckA = luckA;
	}
	
	@Override
	public String doWorkout() {
		// TODO Auto-generated method stub
		return "Swim 100m";
	}
	
	@Override
	public String doLuck() {
		return luckA.doLucky();
	}

}
