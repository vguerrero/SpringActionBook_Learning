package aop.concert.implementations;

import aop.concert.Performance;

public class OperaConcert implements Performance {

	public void perform() throws Exception {

		// throw new Exception("operaConcert something went bad");
		System.out.println("th" + "is is a opera concert, all was good.");

	}

}
