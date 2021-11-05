package com.smoothstack.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.smoothstack.assignment1.SingletonClass;
import com.smoothstack.assignment3.BoundedBuffer;
import com.smoothstack.assignment3.Producer;

class Assignment4Tests {
	/* 
	 * Test to verify that getInstanceCalls() will return 11
	 * when the instance is called 11 times.
	 * Currently, returns 11 sometimes but different numbers other times
	 */
	@Test 
	void singletonClassTest() {
		List<Thread> activeThreads = new ArrayList<Thread>();
		Integer expectedInstanceCalls = 11, actualInstanceCallsValue;
		
		for(int i = 0; i < 10; i++) {
			Thread testThread = new Thread() {
				public void run() {
					SingletonClass.getInstance();
				}
			};
			testThread.start(); // Call getInstance 10 times
			activeThreads.add(testThread);
		}
		
		for(Thread thread : activeThreads) {
			try {
				thread.join();
//				System.out.println("Thread died");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		actualInstanceCallsValue = SingletonClass.getInstance().getInstanceCalls();
		
		assertEquals(expectedInstanceCalls, actualInstanceCallsValue); // The assertion results in the 11th call of getInstance()
	}
	
	/*
	 * Test to verify a producer will produce to their outputPotential
	 */
	@Test
	void producerProductionTest() {
		Integer outputPotential = 100, totalProductStock = 0;
		BoundedBuffer<Integer> productStock = new BoundedBuffer<>(100); // The buffer can have up to 100 items, the max the producer should produce
		
		Producer producer = new Producer(productStock, outputPotential);
		producer.start();
		
		try {
			producer.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(Integer product : productStock.getBufferContent()) {
			totalProductStock += product;
			System.out.println(totalProductStock + ", " + product);
		}
		
		assertEquals(outputPotential, totalProductStock);
	}

}
