package com.rewards.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RewardController {
//A customer receives 2 points for every dollar spent over $100 in each transaction, 
	//plus 1 point for every dollar spent over $50 in each transaction.
	
	@GetMapping("/calculateReward/amount/{amount}")
	public int getReward(@PathVariable int amount) {
		System.out.println("I m here");
		return getAmount(amount);
	}
	
	public  int getAmount( int amount) {
		int reward = 0;
		if(amount >100 ) {
			reward = reward + (amount-100)*2;
			reward = reward +50;
		}else if(amount > 50 ) {
			reward = reward + (amount-50);
		}
		
		return reward;
	}
}
