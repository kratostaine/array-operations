package com.project.waterTrap;

public class WaterTrap {

	public static int getWaterTrapped(int[] towers) {
		int n = towers.length;
		int lIndex = 0, hIndex = n - 1;
		int lMax = 0, rMax = 0;
		int result = 0;

		while (lIndex <= hIndex) {
			if (towers[lIndex] < towers[hIndex]) {
				if (towers[lIndex] > lMax)
					lMax = towers[lIndex];
				else
					result += lMax - towers[lIndex];
				lIndex++;
			} else {
				if (towers[hIndex] > rMax)
					rMax = towers[hIndex];
				else
					result += rMax - towers[hIndex];
				hIndex--;
			}
		}
		return result;
	}
}
