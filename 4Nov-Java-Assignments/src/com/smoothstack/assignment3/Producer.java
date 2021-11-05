/**
 * An Integer producer thread that will produce integers for consumer threads to consume
 */
package com.smoothstack.assignment3;

import java.util.Random;

/**
 * @author Julius Cesar Estrope
 *
 */
public class Producer extends Thread {
	
	private BoundedBuffer<Integer> productStock;
	private Integer outputPotential;
	
	public Producer(BoundedBuffer<Integer> productStock, Integer outputPotential) {
		this.productStock = productStock;
		this.outputPotential = outputPotential;
	}
	
	/*
	 * Generates Integers based on outputPotential. Randomly determines a number from 1 to 10 to add to the productStock
	 */
	public void run() {
		Random random = new Random();
		Integer amountToProduce;
		
		while(outputPotential > 0) {
			amountToProduce = random.nextInt(9) + 1;
			amountToProduce = (amountToProduce > outputPotential)? outputPotential : amountToProduce; // Limit amountToProduce based on remaining outputPotential
			productStock.produce(amountToProduce);
			outputPotential -= amountToProduce;
			System.out.println(this.getName() + " produced: " + amountToProduce);
			try {
				sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
