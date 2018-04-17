package com.project.arrayCombination;

import java.util.HashMap;
import java.util.Map;

public class ArraySumWithMap {
	
	static void showArrayCombination(int[] array, int sum) {
		Map<Integer, Integer> map = new HashMap<>();
		map.put(0, -1); //default added
		int currentSum = 0;
		int result = -1;
		
		for(int i=0; i<array.length;i++) {
			currentSum+=array[i];
			
			if(map.containsKey(currentSum - sum)) {
				Integer value = map.get(currentSum - sum);
				printSubArray(array, value+1, i);
				result++;
			}
			map.put(currentSum, i);
		}
		if(result==-1)
			System.out.print("No matches found");
	}
	
	private static void printSubArray(int[] array, int startIndex, int endIndex) {
		System.out.print("[ ");
		for(int k=startIndex;k<=endIndex;k++) {
			System.out.print(array[k]+" ");
		}
		System.out.println("]");
	}
}
