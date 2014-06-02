package com.shilpa;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class arrayTest {

	@Test
	public void testArraysSort() {
		int[] numbers = {5,8,9,1,3};
		Arrays.sort(numbers);
		int[] expectedOutput = {1,3,5,8,9};
		assertArrayEquals(expectedOutput,numbers);
		
	}

}
