package com.bigDragon.concurrent.createThread;

public class MyThread3 implements Runnable{
	private Long sleepTime;
	
	public MyThread3(String sleepTime) {
        this.sleepTime = Long.parseLong(sleepTime)*1000;
     }
    
	@Override
	public void run(){
		try {
			System.out.println("线程名称："+Thread.currentThread().getName()+"开始sleep时间："+sleepTime);
			Thread.sleep(sleepTime);
			System.out.println("线程名称："+Thread.currentThread().getName()+"结束sleep时间："+sleepTime);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
