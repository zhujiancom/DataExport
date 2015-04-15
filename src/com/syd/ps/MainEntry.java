package com.syd.ps;

import java.util.Date;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.syd.ps.service.BankOrderService;
import com.syd.ps.service.Settled4CfdService;
import com.syd.ps.service.TradeLogService;
import com.syd.ps.service.UserInfoIndividualService;
import com.syd.ps.service.UserProfileService;
import com.syd.ps.thread.ExportTask;
import com.syd.ps.thread.TaskMonitor;

public class MainEntry {
	public static void main(String[] args) throws Exception {
		ExecutorService exec = Executors.newCachedThreadPool();
		CountDownLatch downLatch = new CountDownLatch(5);
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-db.xml");
		BankOrderService bs = (BankOrderService) context.getBean("bankOrderService");
		TradeLogService ts = (TradeLogService) context.getBean("tradeLogService");
		UserProfileService us = (UserProfileService) context.getBean("userProfileService");
		UserInfoIndividualService uis = (UserInfoIndividualService) context.getBean("userInfoIndividualService");
		Settled4CfdService s4s = (Settled4CfdService) context.getBean("settled4cfdService");
		System.out.println("--------begin timestamp: "+new Date());
		exec.execute(new ExportTask(downLatch,bs));
		exec.execute(new ExportTask(downLatch,ts));
		exec.execute(new ExportTask(downLatch,us));
		exec.execute(new ExportTask(downLatch,uis));
		exec.execute(new ExportTask(downLatch,s4s));
		exec.execute(new TaskMonitor(downLatch));
		exec.shutdown();
	}
}
