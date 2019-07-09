package org.avinash.sequence_using_thread;

public class SequenceRunnable implements Runnable {
	private final int PRINT_NUMBERS_UPTO=10;
	static int  number=1;
	private int remainder;
	static Object lock=new Object();
	
	public SequenceRunnable(int remainder) {
		this.remainder= remainder;
	}
	
	public void run() {
		while (number < PRINT_NUMBERS_UPTO-1) {
			synchronized(lock) {
				while(number %3 != remainder) {
					try {
						lock.wait();
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println(Thread.currentThread().getName() + " " + number);
				number++;
				lock.notifyAll();
			}
			
		}
	}

}
