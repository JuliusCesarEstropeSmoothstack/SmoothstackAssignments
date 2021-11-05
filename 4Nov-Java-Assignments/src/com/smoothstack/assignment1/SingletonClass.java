/**
 * Implementation of a Double-Checked-Locking Singleton Class
 */
package com.smoothstack.assignment1;

/**
 * @author Julius Cesar Estrope
 *
 */
public class SingletonClass {

	private static volatile SingletonClass instance;
	private static volatile Integer getInstanceCalls;
	
	private SingletonClass(){
		getInstanceCalls = 0;
	}
	
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			Thread thread = new Thread() {
				public void run() {
					System.out.println("getInstance() called " + SingletonClass.getInstance().getInstanceCalls() + " times.");
				}
			};
			thread.start();
		}
	}
	
	public static SingletonClass getInstance() {
		if (instance == null) { // First null check for the instance
			System.out.println("Null instance when calling getInstance() for SingletonClass");

			synchronized (SingletonClass.class) { // The lock created for the Double-Checked-Locking
				if(instance == null) { // Second null check for the instance (hence Double-Checked)
					System.out.println("Null instance when calling getInstance() for SingletonClass with Double-Checked-Lock");
					instance = new SingletonClass();
				}
			}
		} else {
			System.out.println("Instance exists for SingletonClass. Using existing instance for getInstance()");
		}
		getInstanceCalls++;
		return instance;
	}
	
	public Integer getInstanceCalls() {
		return getInstanceCalls;
	}

}
