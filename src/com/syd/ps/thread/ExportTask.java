package com.syd.ps.thread;

import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import com.syd.ps.service.AbstractExportService;

public class ExportTask implements Runnable {
	private AbstractExportService<?> service;
	private CountDownLatch downLatch;
	
	public ExportTask(CountDownLatch downLatch,AbstractExportService<?> service){
		this.downLatch = downLatch;
		this.service = service;
	}
	
	
	@Override
	public void run() {
		try {
			service.export();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		try {
			TimeUnit.SECONDS.sleep(new Random().nextInt(2));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.downLatch.countDown();
	}

}
