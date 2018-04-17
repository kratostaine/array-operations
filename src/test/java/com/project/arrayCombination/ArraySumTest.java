package com.project.arrayCombination;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.project.arrayCombination.ArraySum;

public class ArraySumTest {
	
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

	@Before
	public void setUpStreams() {
	    System.setOut(new PrintStream(outContent));
	}

	@After
	public void restoreStreams() {
	    System.setOut(System.out);
	}
	
	@Test
	public void findSumArrayWithPositiveIntegers() {
		int[] array = {10,2,6,2,10,5,9,1,7};
		int sum=10;
		ArraySum.findSumArray(array, sum);
		String expectedOutput = "[10]\n[2, 6, 2]\n[10]\n[9, 1]\n";
		assertEquals(expectedOutput, outContent.toString());
	}
	
	@Test
	public void findSumArrayWithNegativeIntegers() {
		int[] array = {2,-4,9,18,-18,27,3,8,1};
		int sum=9;
		ArraySum.findSumArray(array, sum);
		String expectedOutput = "[9]\n[9, 18, -18]\n[-18, 27]\n[8, 1]\n";
		assertEquals(expectedOutput, outContent.toString());
	}
	
	@Test
	public void findSumArrayWithNoMatches() {
		int[] array = {1,6,4,6};
		int sum=9;
		ArraySum.findSumArray(array, sum);
		String expectedOutput = "No matches found";
		assertEquals(expectedOutput, outContent.toString());
	}
}
