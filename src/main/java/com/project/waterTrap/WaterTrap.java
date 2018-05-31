package com.project.waterTrap;

public class WaterTrap {

	public static int getWaterTrapped(int[] towers) {
		int n = towers.length;
		int lIndex = 0, rIndex = n - 1;
		int lMax = 0, rMax = 0;
		int result = 0;

		while (lIndex <= rIndex) {
			if (towers[lIndex] < towers[rIndex]) {
				if (towers[lIndex] > lMax)
					lMax = towers[lIndex];
				else
					result += lMax - towers[lIndex];
				lIndex++;
			} else {
				if (towers[rIndex] > rMax)
					rMax = towers[rIndex];
				else
					result += rMax - towers[rIndex];
				rIndex--;
			}
		}
		return result;
	}
}
