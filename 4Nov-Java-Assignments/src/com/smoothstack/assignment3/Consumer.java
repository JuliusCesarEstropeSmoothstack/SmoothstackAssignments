/**
 * An Integer consumer thread that consumes Integers that producers produce
 * The Consumer attempts to consume up to their consumptionPotential.
 * If the Consumer exceeds their retry limit on attempts to consume, they will stop consuming
 */
package com.smoothstack.assignment3;

/**
 * @author Julius Cesar Estrope
 *
 */
public class Consumer extends Thread{
	
	private BoundedBuffer<Integer> productStock;
	private Integer consumptionPotential, retryLimit;
	
	public Consumer(BoundedBuffer<Integer> productStock, Integer consumptionPotential, Integer retryLimit) {
		this.productStock = productStock;
		this.consumptionPotential = consumptionPotential;
		this.retryLimit = retryLimit;
	}
	
	/*
	 * Consumes from productStock until there is no more stock to consume
	 */
	public void run() {
		Integer productToConsume;
		Integer failedConsumptions = 0;
		
		while(consumptionPotential > 0 && failedConsumptions < retryLimit) {
			productToConsume = productStock.consume();
			if(productToConsume != null) {
				consumptionPotential -= productToConsume;
				failedConsumptions = 0;
				System.out.println(this.getName() + " consumed: " + productToConsume);
			} else {
				failedConsumptions++;
			}
			try {
				sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(failedConsumptions > 0) {
			System.out.println("Consumer gave up after " + failedConsumptions + " attempts.");
		}
	}
}
