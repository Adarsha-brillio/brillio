package com.brillio.training.program;

import com.brillio.training.entity.Television;

public class Program03 {
	public static void main(String[] args) {
		
		Television tv1 = new Television();
		
		tv1.setProductId(12);
		tv1.setProductName("Sony Bravia");
		tv1.setUnitPrice(99999.0);
		tv1.setScreenType("LED");
		tv1.setSize(45);
				
		tv1.print();
	}
}
