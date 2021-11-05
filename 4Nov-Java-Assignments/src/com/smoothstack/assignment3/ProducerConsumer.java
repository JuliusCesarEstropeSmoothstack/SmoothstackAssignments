/**
 * 
 */
package com.smoothstack.assignment3;

/**
 * @author Julius Cesar Estrope
 *
 */
public class ProducerConsumer {

	
	
	public static void main(String[] args) {
		BoundedBuffer<Integer> productStock = new BoundedBuffer<>(100);
		Producer producer1 = new Producer(productStock, 200);
		Producer producer2 = new Producer(productStock, 1000);
		
		Consumer consumer1 = new Consumer(productStock, 400, 3);
		Consumer consumer2 = new Consumer(productStock, 700, 2);
		Consumer consumer3 = new Consumer(productStock, 200, 10);
		
		producer1.start();
		producer2.start();
		
		consumer1.start();
		consumer2.start();
		consumer3.start();
	}

}
