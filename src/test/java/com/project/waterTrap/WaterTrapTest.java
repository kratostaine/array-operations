package com.project.waterTrap;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WaterTrapTest {
	
	@Test
	public void getWaterTrappedTest1() {
		int[] towers = {3,0,0,2,0,4};
		int expectedWaterTrapped = 10; 
		int actualWaterTrapped = WaterTrap.getWaterTrapped(towers);
		assertEquals(expectedWaterTrapped, actualWaterTrapped);
	}
	
	@Test
	public void getWaterTrappedTest2() {
		int[] towers = {0,2,0,3,2,4};
		int expectedWaterTrapped = 3; 
		int actualWaterTrapped = WaterTrap.getWaterTrapped(towers);
		assertEquals(expectedWaterTrapped, actualWaterTrapped);
	}
	
	@Test
	public void getWaterTrappedTest3() {
		int[] towers = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
		int expectedWaterTrapped = 6; 
		int actualWaterTrapped = WaterTrap.getWaterTrapped(towers);
		assertEquals(expectedWaterTrapped, actualWaterTrapped);
	}

}
