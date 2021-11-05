/**
 * An example of how Deadlock can occur within a program.
 * Deadlock in this example can be avoided by changing the order that locks are acquired
 */
package com.smoothstack.assignment2;

/**
 * @author Julius Cesar Estrope
 *
 */
public class DeadlockExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String lockA = "I am a lock";
		String lockB = "I am b lock";
		
		Thread threadA, threadB;
		
		threadA = new Thread() {
			
			public void run() {
				synchronized (lockA) {
					System.out.println("Using lockA");
					try {
						Thread.sleep(100);
					} catch (Exception e) {
						e.printStackTrace();
					}

					System.out.println("Waiting for lockB");
					synchronized (lockB) {
						System.out.println("Using lockA and lockB");
						try {
							Thread.sleep(100);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
					
				}
			}
		};
		
		threadB = new Thread() {
			public void run() {
				synchronized (lockB) {
					System.out.println("Using lockB");
					try {
						Thread.sleep(100);
					} catch (Exception e) {
						e.printStackTrace();
					}

					System.out.println("Waiting for lockA");
					synchronized (lockA) {
						System.out.println("Using lockB and lockA");
						try {
							Thread.sleep(100);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
					
				}
			}
		};
		
		threadA.start();
		threadB.start();
	}

}

