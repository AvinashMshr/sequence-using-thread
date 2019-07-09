package org.avinash.sequence_using_thread;

import junit.framework.TestCase;

public class SequenceRunnableTest extends TestCase{
	public void testHappy() {
		SequenceRunnable runnable1=new SequenceRunnable(1);
		SequenceRunnable runnable2=new SequenceRunnable(2);
		SequenceRunnable runnable3=new SequenceRunnable(0);
		
		Thread t1=new Thread(runnable1,"T1");
		Thread t2=new Thread(runnable2,"T2");
		Thread t3=new Thread(runnable3,"T3");
		
		t1.start();
		t2.start();
		t3.start();	
	}

}
