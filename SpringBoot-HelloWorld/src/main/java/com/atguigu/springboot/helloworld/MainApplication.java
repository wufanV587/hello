package com.atguigu.springboot.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication   //让当前类成为组件
public class MainApplication {
	
	public static void main(String[] args) {
		//启动springboot项目的  方法
		SpringApplication.run(MainApplication.class, args);
	}
}
