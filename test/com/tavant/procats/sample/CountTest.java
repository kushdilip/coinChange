package com.tavant.procats.sample;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class CountTest {

	@Test
	public void testCountRupeeNotes() {
		ICount count = new Count();
		List<Integer> coins = new ArrayList<Integer>();
		coins.add(1);
		coins.add(2);
		assertEquals(new Integer(3), count.countRupeeNotes(4, coins));
	}

	@Test
	public void testRupeeNotes2() {
		ICount count = new Count();
		List<Integer> coins = new ArrayList<Integer>();
		coins.add(5);
		coins.add(10);
		coins.add(20);
		coins.add(50);
		coins.add(100);
		coins.add(200);
		coins.add(500);
		assertEquals(new Integer(1022), count.countRupeeNotes(300, coins));
	}

	@Test
	public void testRupeeNotes3() {
		ICount count = new Count();
		List<Integer> coins = new ArrayList<Integer>();
		coins.add(5);
		coins.add(10);
		coins.add(20);
		coins.add(50);
		coins.add(100);
		coins.add(200);
		coins.add(500);
		assertEquals(new Integer(0), count.countRupeeNotes(301, coins));
	}
}
