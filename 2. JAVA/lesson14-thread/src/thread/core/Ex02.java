package thread.core;


import java.util.concurrent.TimeUnit;

import utils.ThreadUtils;

public class Ex02 {
	public static void main(String[] args) {
		System.out.println("main start");
		Thread t1 = new Thread(new Task(), "thread2");
		t1.start();
		//current thread
		ThreadUtils.printCurrentThreadName();
		System.out.println("main end");
	}
	
	private static class Task implements Runnable {
		@Override
		public void run() {
			ThreadUtils.doTask(2, TimeUnit.SECONDS);
			ThreadUtils.printCurrentThreadName();
			System.out.println("running a task...");
		}
	}
}
