package com.bigDragon.concurrent.createThread;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;

@Controller
@RequestMapping("/threadPool")
public class ThreadPool {

	@Autowired
    private ThreadPoolTaskExecutor taskExecutor;
	
	@RequestMapping("/testThreadPool")
	public String testThreadPool(@RequestBody String json){
        JSONObject jsonObject=JSONObject.parseObject(json);
        String sleepTime=jsonObject.get("sleepTime").toString();
   	 	System.out.println("获取当前线程池的线程数量:"+taskExecutor.getPoolSize());
   	 	System.out.println("获取活动的线程的数量:"+taskExecutor.getActiveCount());
        MyThread3 myThread3=new MyThread3(sleepTime);
   	 	taskExecutor.execute(myThread3);
		return "SUCCESS";
	}
	@RequestMapping("/hello")
	public ModelAndView hello(@RequestBody String json){
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("demo");
		return modelAndView;
	}
}