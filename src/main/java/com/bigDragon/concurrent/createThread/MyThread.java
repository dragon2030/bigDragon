package com.bigDragon.concurrent.createThread;

public class MyThread extends Thread {/*
	public MyThread() {
		
	}
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread()+":"+i);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//切换线程
			Thread.yield();
			System.out.println(Thread.currentThread()+":"+i+"后半部分");
		}
	}
	public static void main(String[] args) {
		MyThread mThread1=new MyThread();
		MyThread mThread2=new MyThread();
		mThread1.start();
		mThread2.start();
		
		new Thread(){
			public void run(){
				for(int j=0;j<3;j++){
					System.out.println(Thread.currentThread()+":外部"+j);
				}
			}
		}.start();
	}
*/

	private int i;
	
	public static void main(String[] args) {
		for(int j = 0;j < 50;j++) {
			
			//调用Thread类的currentThread()方法获取当前线程
			System.out.println(Thread.currentThread().getName() + " " + j);
			new MyThread().start();

		}
	}
 
	public void run(){
		for(int i=0;i < 100;i++) {
			System.out.println(this.getName() + " "  + i+"start");
			//当通过继承Thread类的方式实现多线程时，可以直接使用this获取当前执行的线程
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(this.getName() + " "  + i+"end");
		}
	}
	}