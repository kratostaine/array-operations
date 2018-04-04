package com.project.arraySumCombination;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraySum {
	
	static void findSumArray(int[] array, int sum) {
		int result=-1;
		for(int i=0;i<array.length;i++) {
			int arraySum=0;
			List<Integer> subArray = new ArrayList<Integer>();
			for(int j=i;j<array.length;j++) {
				arraySum+=array[j];
				subArray.add(array[j]);
				if(arraySum==sum) {
					printArray(subArray);
					result+=1;
				}
			}
		}
		if(result==-1)
			System.out.print("No matches found");
	}
	
	static void printArray(List<Integer> array) {
		System.out.println(Arrays.toString(array.toArray()));
	}

}
