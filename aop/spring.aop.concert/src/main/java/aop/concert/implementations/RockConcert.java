package aop.concert.implementations;

import aop.concert.Performance;

public class RockConcert implements Performance {

	public void perform() {
		try {
			System.out.println("this is a ROCK concert, all was good.");
		} catch (Exception e) {
			System.out.println("something in RockConcert went wrong..");
		}

	}

}
