package com.msus.MyMavenExample;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;

import com.msus.MyMavenExample.App;

public class AppTest 
{

	@Test
	public void shouldReturnTrueFor1_2_8_9(){
		// given
		Collection<Integer> list = Arrays.asList(1,2,8,9);
		// then
		boolean result = App.returnIfAllBelowValue(list, 10);
		// when
		assertTrue(result);
	}
	
	
}
