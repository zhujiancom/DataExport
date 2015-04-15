package com.syd.ps.thread;

import java.util.Date;
import java.util.concurrent.CountDownLatch;

public class TaskMonitor implements Runnable {
	private CountDownLatch downLatch;
	
	public TaskMonitor(CountDownLatch downLatch){
		this.downLatch = downLatch;
	}
	
	@Override
	public void run() {
		try {
			downLatch.await();
			System.out.println("------ 任务完成   -------");
			System.out.println("------ end timestamp:　"+new Date());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
