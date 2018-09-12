package com.project.stringOperation;

import java.util.Arrays;
import java.util.Comparator;

public class StringArrange {
	
	public static void main(String[] args) {
		String sentence = "Take me back to the future";
		String sentenceLC = sentence.toLowerCase();
		String[] words = sentenceLC.split("\\s+");
		Arrays.sort(words);
	}
	
	public class WordComparator implements Comparator<String>{

		@Override
		public int compare(String s1, String s2) {
			return s1.length() - s2.length();
		}
		
	}

}
