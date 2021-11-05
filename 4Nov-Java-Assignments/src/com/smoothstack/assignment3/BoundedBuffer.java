/**
 * Implementation of a BoundedBuffer 
 */
package com.smoothstack.assignment3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Julius Cesar Estrope
 *
 */
public class BoundedBuffer<T> {

	private Integer bound;
	private List<T> bufferContents;

	/*
	 * The BoundedBuffer's bound is the maximum quantity of a product it can hold
	 */
	public BoundedBuffer(Integer bound) {
		this.bound = bound;
		bufferContents = new ArrayList<T>();
	}

	/*
	 * This function adds an element to the buffer and returns the number of
	 * elements in the buffer. If the buffer has reached the bound, the item will
	 * not be added
	 */
	public Integer produce(T product) {
		synchronized (bufferContents) {
			if (bufferContents.size() < bound) {
				bufferContents.add(product);
			}
		}
		return bufferContents.size();
	}

	public T consume() {
		T product = null;
		
		synchronized (bufferContents) {
			if(bufferContents.size() > 0) {
				product = bufferContents.get(0);
				bufferContents.remove(0);
			}
		}
		
		return product;
	}
	
	public List<T> getBufferContent(){
		return bufferContents;
	}

}
