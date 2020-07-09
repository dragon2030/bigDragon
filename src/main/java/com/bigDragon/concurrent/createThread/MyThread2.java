package com.bigDragon.concurrent.createThread;

public class MyThread2 implements Runnable{
	public void run(){
		for(int i=0;i<3;i++){
			Thread.currentThread().setName("lalala");
			System.out.println(i+"run()..."+Thread.currentThread().getName());
		}
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		MyThread2 myThread2=new MyThread2();
		Thread trThread=new Thread(myThread2);
		trThread.start();
		for(int i=0;i<10;i++){

			System.out.println(i+"main()..."+Thread.currentThread().getName());
		}
		System.out.println("简化建立线程前执行的语句");
		//简化书写
		try{
			new Thread(new Runnable() {
				@Override
				public void run() {
					// TODO Auto-generated method stub
					for(int i=0;i<10;i++){
						System.out.println(i+"外部方法"+Thread.currentThread().getName());
					}
				}
			}).start();
			System.out.println("简化建立线程后执行的语句");
			for(int i=0;i<20;i++){
				System.out.println(i+"简化建立线程后执行的语句"+Thread.currentThread().getName());
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
