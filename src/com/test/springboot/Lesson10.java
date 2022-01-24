package com.test.springboot;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Lesson10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		
		SwimCoach coach = context.getBean("swimCoach", SwimCoach.class);
		
		System.out.println(coach.doWorkout());
		
		System.out.println(coach.doLuck());
		
		LuckA luckA = context.getBean("luckA", LuckA.class);
		
		System.out.println(coach.getEmail());
		
		System.out.println(coach.getName());


	}

}
