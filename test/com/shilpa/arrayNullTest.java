package com.shilpa;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class arrayNullTest {

	@Test(expected=NullPointerException.class)
	public void arrayTest() {
		int[] numbers = {2,6};
		Arrays.sort(numbers);
	}

}
